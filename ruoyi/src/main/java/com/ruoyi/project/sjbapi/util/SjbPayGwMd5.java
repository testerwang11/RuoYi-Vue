package com.ruoyi.project.sjbapi.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

public class SjbPayGwMd5 {

    public static String sign(String text, String key, String input_charset) {
        text = text + key;
        return DigestUtils.md5Hex(getContentBytes(text, input_charset));
    }

    public static boolean verify(String text, String sign, String key, String input_charset) {
        text = text + key;
        String mysign = DigestUtils.md5Hex(getContentBytes(text, input_charset));
        if (mysign.equals(sign))
            return true;
        return false;
    }

    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || "".equals(charset))
            return content.getBytes();
        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名错误，您指定的编码集为"+ charset);
        }
    }
}
