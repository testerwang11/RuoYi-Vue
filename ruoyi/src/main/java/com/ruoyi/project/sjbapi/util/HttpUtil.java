package com.ruoyi.project.sjbapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
    public static String httpsPost(String reqUrl, String param) throws NoSuchAlgorithmException, NoSuchProviderException, IOException, KeyManagementException {
        URL url = new URL(reqUrl);
        HttpsURLConnection httpsConn = (HttpsURLConnection)url.openConnection();
        httpsConn.setHostnameVerifier(new HostnameVerifier() {
            public boolean verify(String paramString, SSLSession paramSSLSession) {
                return true;
            }
        });
        TrustManager tm = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {}

            public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws CertificateException {}

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, new TrustManager[] { tm }, new SecureRandom());
        SSLSocketFactory ssf = sslContext.getSocketFactory();
        httpsConn.setSSLSocketFactory(ssf);
        httpsConn.setDoOutput(true);
        httpsConn.setRequestMethod("POST");
        httpsConn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        httpsConn.setRequestProperty("Content-Length", String.valueOf(param.length()));
        OutputStreamWriter out = new OutputStreamWriter(httpsConn.getOutputStream(), "UTF-8");
        out.write(param);
        out.flush();
        out.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(httpsConn.getInputStream(), "UTF-8"));
        String tempLine = "";
        StringBuffer resultBuffer = new StringBuffer();
        while ((tempLine = reader.readLine()) != null)
            resultBuffer.append(tempLine).append(System.getProperty("line.separator"));
        return resultBuffer.toString();
    }

    public static String post(String url, String jsons) {
        CloseableHttpClient httpClient = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            if (jsons != null && jsons.length() > 0) {
                StringEntity postingString = new StringEntity(jsons, "UTF-8");
                httpPost.setEntity((HttpEntity)postingString);
                httpPost.setHeader("Content-type", "application/json");
            }
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(10000).setConnectTimeout(10000).build();
            httpPost.setConfig(requestConfig);
            CloseableHttpResponse closeableHttpResponse = httpClient.execute((HttpUriRequest)httpPost);
            if (closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = closeableHttpResponse.getEntity();
                if (entity != null) {
                    String out = EntityUtils.toString(entity, "UTF-8");
                    return out;
                }
            }
        } catch (UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException("字符编码错误");
        } catch (ClientProtocolException e) {
            System.err.println("链接超时:"+ url);
            throw new RuntimeException("链接超时");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO异常:"+ url);
            throw new RuntimeException("IO异常");
        } finally {
            try {
                if (null != httpClient)
                    httpClient.close();
            } catch (IOException e) {
                System.err.println("httpClient.close()异常");
                throw new RuntimeException("关闭链接异常");
            }
        }
        return null;
    }
}
