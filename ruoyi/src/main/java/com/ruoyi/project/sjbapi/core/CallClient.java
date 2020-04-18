package com.ruoyi.project.sjbapi.core;

import com.ruoyi.project.sjbapi.util.DateUtil;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.config.*;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.*;
import org.apache.http.impl.io.DefaultHttpRequestWriterFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.CharArrayBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("deprecation")
public class CallClient {
    private static final Logger log = LoggerFactory.getLogger(CallClient.class);

    private CloseableHttpClient httpclient = null;

    /**
     * DefaultHttpClient execute
     */
    private HttpRequestBase req = null;

    /**
     *
     */
    private HttpMethodBase req2 = null;


    /**
     * 响应内容
     */
    private String responseString = null;

    /**
     * 请求方式默认POST
     */
    private String mode = "POST";

    /**
     * response
     */
    private CloseableHttpResponse resp;

    MultipartEntityBuilder reqEntity = MultipartEntityBuilder.create();

    /**
     * 请求开始时间yyyyMMddhhmmssSSS格式
     */
    private String requestStartTime;

    /**
     * 请求结束时间yyyyMMddhhmmssSSS格式
     */
    private String requestStopTime;

    /**
     * 响应结束时间 yyyyMMddhhmmssSSS格式
     */
    private String responseStopTime;

    /**
     * 请求消耗时间(单位秒)
     */
    private double duration;

    /**
     * 默认超时时间
     */
    public static int connectTimeout = 1000 * 60;

    private String entityString = "";
    private HttpEntity entity;

    private static SSLConnectionSocketFactory sslsf = null;

    public CallClient(String url, String model) {
        getRequest(url, model);
        DefaultHttpResponseParserFactory responseParserFactory = new DefaultHttpResponseParserFactory() {
            @Override
            public HttpMessageParser<HttpResponse> create(SessionInputBuffer buffer, MessageConstraints constraints) {
                LineParser lineParser = new BasicLineParser() {
                    @Override
                    public Header parseHeader(final CharArrayBuffer buffer) {
                        try {
                            return super.parseHeader(buffer);
                        } catch (ParseException ex) {
                            return new BasicHeader(buffer.toString(), null);
                        }
                    }
                };
                return new DefaultHttpResponseParser(buffer, lineParser, DefaultHttpResponseFactory.INSTANCE,
                        constraints) {
                    @Override
                    protected boolean reject(final CharArrayBuffer line, int count) {
                        return false;
                    }
                };
            }
        };
        HttpMessageWriterFactory<HttpRequest> requestWriterFactory = new DefaultHttpRequestWriterFactory();
        HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory = new ManagedHttpClientConnectionFactory(
                requestWriterFactory, responseParserFactory);
        SSLContextBuilder builder = null;
        try {
            builder = new SSLContextBuilder();
            // 全部信任 不做身份鉴定
            builder.loadTrustMaterial(null, new TrustStrategy() {
                @Override
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                    return true;
                }
            });
            sslsf = new SSLConnectionSocketFactory(builder.build(), new String[]{"SSLv2Hello", "SSLv3", "TLSv1", "TLSv1.2"}, null, NoopHostnameVerifier.INSTANCE);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", new PlainConnectionSocketFactory())
                .register("https", sslsf)
                .build();

        // Create a connection manager with custom configuration.
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(registry,
                connFactory);

        // Create socket configuration
        SocketConfig socketConfig = SocketConfig.custom().setTcpNoDelay(true).build();
        connManager.setDefaultSocketConfig(socketConfig);
        // connManager.setSocketConfig(new HttpHost("somehost", 80),
        // socketConfig);
        connManager.setValidateAfterInactivity(1000);

        // Create message constraints
        MessageConstraints messageConstraints = MessageConstraints.custom().setMaxHeaderCount(20000)
                .setMaxLineLength(20000).build();
        // Create connection configuration
        ConnectionConfig connectionConfig = ConnectionConfig.custom().setMalformedInputAction(CodingErrorAction.IGNORE)
                .setUnmappableInputAction(CodingErrorAction.IGNORE).setCharset(Consts.UTF_8)
                .setMessageConstraints(messageConstraints).build();
        connManager.setDefaultConnectionConfig(connectionConfig);
        connManager.setMaxTotal(1000);
        connManager.setDefaultMaxPerRoute(1000);

        CookieStore cookieStore = new BasicCookieStore();
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        HttpHost http1 = new HttpHost("192.168.12.122", 8083);
        HttpHost http2 = new HttpHost("192.168.220.115", 9999);
        HttpHost http3 = new HttpHost("192.168.210.155", 9091);
        HttpHost proxy = new HttpHost("192.168.220.42", 808);

        RequestConfig defaultRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT)
                //.setExpectContinueEnabled(true)
                .setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM, AuthSchemes.DIGEST))
                .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC))
                .setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectTimeout)
                .setSocketTimeout(connectTimeout)
                //.setRedirectsEnabled(true)

                .build();

        //HttpHost http = new HttpHost("192.168.220.115", 8083, "http");
        //HttpHost https = new HttpHost("192.168.220.115", 8083, "https");
        DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(http1);
        httpclient = HttpClients.custom().setConnectionManager(connManager)
                .setDefaultCookieStore(cookieStore)
                .setDefaultCredentialsProvider(credentialsProvider)
                //.setRoutePlanner(routePlanner)
                //.setProxy(proxy)
                .disableRedirectHandling()
                .setDefaultRequestConfig(defaultRequestConfig)
                .build();
    }

    /**
     * 自定义DNS解析
     *
     * @return
     */
    private static DnsResolver getDnsResolver2() {
        InMemoryDnsResolver dnsResolver = new InMemoryDnsResolver();

        try {
            //dnsResolver.add("www.ch.com", Inet4Address.getByName("192.168.210.163"));
            dnsResolver.add("www.ch.com", Inet4Address.getByName("180.153.29.57"));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return dnsResolver;
    }

    /**
     * 使用url创建Request
     *
     * @param url  Requesturl地址
     * @param Mode GET or POST or FILE
     * @return HttpRequestBase
     */
    public HttpRequestBase createRequest(String url, String Mode) {
        this.mode = Mode.toUpperCase();
        HttpPost httppost = null;
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(connectTimeout).setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectTimeout).build();

        if (mode.equals("GET")) {
            HttpGet httpget = new HttpGet(url);
            httpget.setConfig(requestConfig);
            return httpget;
        } else if (mode.equals("POST")) {
            httppost = new HttpPost(url);
            httppost.setConfig(requestConfig);
            return httppost;
        } else if (mode.equals("FILE")) {
            httppost = new HttpPost(url);
            httppost.setConfig(requestConfig);
            return httppost;
        } else if (mode.equals("PUT")) {
            HttpPut httpPut = new HttpPut(url);
            httpPut.setConfig(requestConfig);
            return httpPut;
        } else if (mode.equals("DELETE")) {
            HttpDelete httpDelete = new HttpDelete(url);
            httpDelete.setConfig(requestConfig);
            return httpDelete;
        } else if (mode.equals("DELETE2")) {
            HttpDelete httpDelete = new HttpDelete(url);
            httpDelete.setConfig(requestConfig);
            return httpDelete;
        } else {
            httppost = new HttpPost(url);
        }
        // 默认返回POST
        return httppost;
    }

    /**
     * 使用url创建Request
     *
     * @param url  Requesturl地址
     * @param Mode GET or POST or FILE
     * @return HttpRequestBase
     */
    public HttpMethodBase createRequest2(String url, String Mode) {
        this.mode = Mode.toUpperCase();
        PostMethod httppost = null;
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(connectTimeout).setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectTimeout).build();

        if (mode.equals("GET")) {
            GetMethod httpget = new GetMethod(url);
            //httpget.setConfig(requestConfig);
            return httpget;
        } else if (mode.equals("POST")) {
            httppost = new PostMethod(url);
            //httppost.setConfig(requestConfig);
            return httppost;
        } else if (mode.equals("FILE")) {
            httppost = new PostMethod(url);
            //httppost.setConfig(requestConfig);
            return httppost;
        } else if (mode.equals("PUT")) {
            PutMethod putMethod = new PutMethod(url);
            return putMethod;
        } else if (mode.equals("DELETE")) {
            DeleteMethod deleteMethod = new DeleteMethod(url);

            return deleteMethod;
        } else {
            httppost = new PostMethod(url);
        }
        // 默认返回POST
        return httppost;
    }

    /**
     * 添加Header
     *
     * @param name  header的name
     * @param value header的value
     */
    public void addHeader(String name, String value) {
        req.addHeader(name, value);
    }

    /**
     * 设置内容
     * <p>
     * 报文
     */
    public void setEntity(String entityString) {
        this.entityString = entityString;
        try {
            StringEntity se = new StringEntity(entityString, HTTP.UTF_8);
            this.entity = se;

            if (mode.equals("POST")) {
                ((HttpPost) req).setEntity(se);
            } else if (mode.equals("GET")) {
                if (entityString.length() > 0) {
                    if (req.getURI().toString().contains("?")) {
                        req.setURI(new URI(req.getURI() + "&" + entityString));
                    } else {
                        req.setURI(new URI(req.getURI() + "?" + entityString));
                    }
                }
            } else if (mode.equals("FILE")) {
                if (entityString.length() > 0) {
                    req.setURI(new URI(req.getURI() + "?" + entityString));
                }
                reqEntity.setCharset(Charset.forName("utf8"));
                reqEntity.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
                HttpEntity entity = reqEntity.build();
                ((HttpPost) req).setEntity(entity);
            } else if (mode.equals("PUT")) {
                ((HttpPut) req).setEntity(se);
            } else if (mode.equals("DELETE")) {
                //((HttpDelete) req).setEntity(se);
                req.setURI(new URI(req.getURI() + "?" + entityString));
            } else if (mode.equals("DELETE2")) {
                req.setURI(new URI(req.getURI() + "/" + entityString));
            } else {
                ((HttpPost) req).setEntity(se);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEntity(HttpEntity entity) {
        this.entity = entity;
        this.entityString = entityToString(entity);
        try {
            if (mode.equals("POST")) {
                ((HttpPost) req).setEntity(entity);
            } else if (mode.equals("GET")) {
                if (entityString.length() > 0) {
                    if (req.getURI().toString().contains("?")) {
                        req.setURI(new URI(req.getURI() + "&" + entityString));
                    } else {
                        req.setURI(new URI(req.getURI() + "?" + entityString));
                    }
                }
            } else if (mode.equals("FILE")) {
                if (entityString.length() > 0) {
                    req.setURI(new URI(req.getURI() + "?" + entity));
                }
                reqEntity.setCharset(Charset.forName("utf8"));
                reqEntity.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
                ((HttpPost) req).setEntity(entity);
            } else if (mode.equals("PUT")) {
                ((HttpPut) req).setEntity(entity);
                //req.setURI(new URI(req.getURI() + "?" + entityString));
            } else if (mode.equals("DELETE")) {
                req.setURI(new URI(req.getURI() + "?" + entityString));
            } else if (mode.equals("DELETE2")) {
                req.setURI(new URI(req.getURI() + "/" + entityString));
            } else {
                ((HttpPost) req).setEntity(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 发送请求
     *
     * @return
     * @throws IOException
     * @throws ClientProtocolException
     */
    public void sendRequest() throws ClientProtocolException, IOException, SocketTimeoutException {
        requestStartTime = DateUtil.dateTimeNow();
        log.info("请求地址:" + req.getURI());
        log.info("请求方式:" + req.getMethod());
        log.info("请求参数:" + entityString);

        long reqStart = System.currentTimeMillis();
        requestStartTime = DateUtil.formatDate(DateUtil.YYYYMMDDHHMMSSS, reqStart);
        resp = httpclient.execute(req);
        if (resp.getStatusLine().getStatusCode() == 302) {
            String uri = resp.getHeaders("Location")[0].getValue();
            String url = null;
            if (!uri.startsWith("http")) {
                url = "http://" + req.getURI().getHost() + uri;
            } else {
                url = uri;
            }
            log.info("重定向:" + url);
            Header[] reqheaders = req.getAllHeaders();//取请重定向前求头cookies
            req = createRequest(url, "GET");
            Header[] respheaders = resp.getAllHeaders();//取重定向前响应头cookies
            String cookies = "";
            for (Header h : respheaders) {
                //如果重定向返回了cookies，则用重定向的cookies
                if (h.getName().equalsIgnoreCase("Set-Cookie")) {
                    cookies += h.getValue().split(";")[0] + ";";
                } else {
                    //重定向没有返回cookies,则使用请求头的cookies
                    for (Header h2 : reqheaders) {
                        if (h2.getName().equals("Cookie")) {
                            cookies += h2.getValue().split(";")[0] + ";";
                        }
                    }
                }
            }
            req.addHeader("Cookie", cookies);
            resp = httpclient.execute(req);
        }
        long reqStop = System.currentTimeMillis();

        requestStopTime = DateUtil.formatDate(DateUtil.YYYYMMDDHHMMSSS, reqStop);

        responseString = entityToString(resp.getEntity());
        //释放连接
        req.releaseConnection();
        long repStop = System.currentTimeMillis();
        responseStopTime = DateUtil.formatDate(DateUtil.YYYYMMDDHHMMSSS, repStop);
        duration = repStop - reqStart;
        log.info("响应状态:" + resp.getStatusLine().getStatusCode());

        //logToReport("请求开始时间:" + requestStartTime);
        //logToReport("请求结束时间:" + requestStopTime);

        //logToReport("请求消耗时间:" + (reqStop - reqStart));
        //logToReport("响应消耗时间:" + (repStop - reqStop));


        if (!responseString.startsWith("<!DOCTYPE html>") || responseString.startsWith("<html>")) {
            log.info("响应报文:" + responseString);
        } else {
            //logToReport("响应报文:" + "Html内容忽略");
            log.info("响应报文:" + responseString);
        }
    }

    public String entityToString(HttpEntity entity) {
        if (entity == null) {
            return "";
        }
        BufferedReader reader = null;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
        } catch (IOException e) {
            //LoggerUtil.error(e.getMessage());
            e.printStackTrace();
        }
        return sb.toString();
    }

    /**
     * 返回请求消耗时间，单位秒
     *
     * @return duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * 请求开始时间
     *
     * @return yyyyMMddhhmmssSSS格式
     */
    public String getRequestStartTime() {
        return requestStartTime;
    }

    /**
     * 请求结束时间
     *
     * @return yyyyMMddhhmmssSSS格式
     */
    public String getRequestStopTime() {
        return requestStopTime;
    }

    /**
     * 响应读取结束时间
     *
     * @return yyyyMMddhhmmssSSS格式
     */
    public String getResponseStopTime() {
        return responseStopTime;
    }

    /**
     * 获取http请求状态
     *
     * @return 状态返回码 如遇到异常返回-1
     */
    public int getStatusCode() {

        int statusCode = -1;
        try {
            statusCode = resp.getStatusLine().getStatusCode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusCode;
    }

    /**
     * 获取 head 中的 Cookie
     *
     * @return 获得 Cookie
     */
    public List<String> getCookies() {
        List<String> Cookies = new ArrayList<String>();
        try {
            // 添加response Set-Cookie
            Header[] respheader = resp.getAllHeaders();
            for (int i = 0; i < respheader.length; i++) {
                if (respheader[i].getName().equalsIgnoreCase("Set-Cookie")) {
                    if (respheader[i].getValue().trim().length() > 0) {
                        Cookies.add(respheader[i].getValue());
                    }
                }
            }
            // 添加request Cookie
            Header[] reqheader = req.getAllHeaders();
            for (int i = 0; i < reqheader.length; i++) {
                if (reqheader[i].getName().equalsIgnoreCase("Cookie")) {
                    if (reqheader[i].getValue().trim().length() > 0) {
                        Cookies.add(reqheader[i].getValue());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Cookies;
    }

    public String getCookie() {
        String set_cookie = resp.getFirstHeader("Set-Cookie").getValue();
        return set_cookie;
    }

    /**
     * 设置连接超时时间
     *
     * @param timeout 连接超时时间，单位ms
     */
    public void setConnectionTimeout(int timeout) {
        httpclient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, timeout);
    }

    public void setSoTimeout(int timeout) {
        httpclient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, timeout);
    }

    public void close() {
        try {
            httpclient.close();
            httpclient.getConnectionManager().shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取返回Header
     *
     * @param headerid headerid
     * @return header value
     */
    public String getResposeHeader(String headerid) {
        String header = null;
        try {
            Header[] headers = resp.getAllHeaders();
            for (int i = 0; i < headers.length; i++) {
                if (headers[i].getName().equalsIgnoreCase(headerid)) {
                    header = headers[i].getValue();
                    return header;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return header;
    }

    /**
     * 获取response 返回内容 String
     *
     * @return responseString
     */
    public String getResponseString() {
        return responseString;
    }

    /**
     * removeAllHeader 移除 HttpRequestBase 的所有 Header
     */
    public void removeAllHeader() {
        try {
            Header[] header = req.getAllHeaders();
            for (int i = 0; i < header.length; i++) {
                req.removeHeader(header[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 新建请求
     *
     * @param url
     * @param model
     */
    public void getRequest(String url, String model) {
        req = createRequest(url, model);
    }

    /**
     * 添加文件
     *
     * @param name 参数名
     * @param fn   文件路径
     */
    public void addPart(String name, String fn) {
        FileBody fb = new FileBody(new File(fn));
        reqEntity.addPart(name, fb);
    }

    /**
     * @return 获取所有CloseableHttpResponse header Name:Value
     */
    public List<String> getAllHeader() {
        List<String> Cookies = new ArrayList<String>();
        try {
            Header[] respheader = resp.getAllHeaders();
            for (int i = 0; i < respheader.length; i++) {
                if (respheader[i].getValue().trim().length() > 0) {
                    Cookies.add(respheader[i].getName() + ":" + respheader[i].getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Cookies;
    }

    //@Step("{0}")
    public void logToReport(String message) {
        //ExtentTestNGITestListener.logger(message);
        //logger.info(message);
        //Reporter.log(message, false);
        log.info(message);
        //Allure.attachment(type, message);

        //String a = "image/png;text/plain;text/html";
        //Allure.addAttachment("String attachment", "text/html", "<p>HELLO</p>");
        //Allure.addAttachment("测试2", "txt", new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8)), "txt");
        //new ByteArrayInputStream(message.getBytes());
        //new AllureLifecycle().writeAttachment("测试2", new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8)));
        //ExtentTestNGITestListener2.log(Status.INFO, message);
    }


    /**
     * 获取域名
     *
     * @param url
     * @return
     */
    public String getDomain(String url) {
        String result = "";
        int j = 0, startIndex = 0, endIndex = 0;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                j++;
                if (j == 2)
                    startIndex = i;
                else if (j == 3)
                    endIndex = i;
            }
        }
        result = url.substring(0, endIndex);
        return result;
    }

    public static void main(String[] args) throws IOException {
        // String url =
        // "https://bpassport.ch.com/zh_cn/Login/PopPC?ReturnUrl=%2F%3Fwa%3Dwsignin1.0%26wtrealm%3Dhttps%253A%252F%252Fwww.ch.com%252F%26wctx%3Drm%253D0%2526id%253Dpassive%2526ru%253Dhttps%25253A%25252F%25252Fwww.ch.com%25252FauthClient%25252FAuthHepler%25252FLoginTempIndex%25253Fstrcmd%25253Dwindow.parent.parent.%252524.fn.head.updateUser()%25253B%252526parentUrl%25253Dhttps%25253A%25252F%25252Fwww.ch.com%25252F%26wct%3D2016-11-1T9%253A0%253A12Z%26wreply%3Dhttps%253A%252F%252Fwww.ch.com%252F&wa=wsignin1.0&wtrealm=https%3A%2F%2Fwww.ch.com%2F&wctx=rm%3D0%26id%3Dpassive%26ru%3Dhttps%253A%252F%252Fwww.ch.com%252FauthClient%252FAuthHepler%252FLoginTempIndex%253Fstrcmd%253Dwindow.parent.parent.%2524.fn.head.updateUser()%253B%2526parentUrl%253Dhttps%253A%252F%252Fwww.ch.com%252F&wct=2016-11-1T9%3A0%3A12Z&wreply=https%3A%2F%2Fwww.ch.com%2F&logoutvpath=";
        String url = "https://www.sijibao.com/";

        String model = "GET";
        CallClient call = new CallClient(url, model);
        call.getRequest(url, model);
        //call.setEntity("a=1");
        //call.setEntity("Currency=0&SType=0&Departure=%E4%B8%8A%E6%B5%B7&Arrival=%E5%B9%BF%E5%B7%9E&DepartureDate=2017-01-13&ReturnDate=null&IsIJFlight=false&IsBg=false&IsEmployee=false&IsLittleGroupFlight=false&SeatsNum=1&ActId=0&IfRet=true");
        call.sendRequest();
        call.close();
        System.out.println(call.getResponseString());
    }

}
