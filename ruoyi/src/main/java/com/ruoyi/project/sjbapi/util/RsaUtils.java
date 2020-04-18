package com.ruoyi.project.sjbapi.util;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class RsaUtils {
    public static void main1(String[] args) throws Exception {
        String message = "merchantNo=60881632108545";
        String pubic = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCAW75pWhHnekWpe+fhpFaZK5dzDjj44bbOpwp2XLcORQpe/J1fjpTSrYsaEUb/MzIZ+AbieYmHqMt98db3pIhu+KteYpXlU2BVTx1he1J9YoWzCYf6YdcqUcSrCG6CoAWXchF7q10VOXfG8NPvHz1yEzPe9+EdemcUw06Lc7PTkQIDAQAB";
        String privateKey = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAIBbvmlaEed6Ral75+GkVpkrl3MOOPjhts6nCnZctw5FCl78nV+OlNKtixoRRv8zMhn4BuJ5iYeoy33x1vekiG74q15ileVTYFVPHWF7Un1ihbMJh/ph1ypRxKsIboKgBZdyEXurXRU5d8bw0+8fPXITM9734R16ZxTDTotzs9ORAgMBAAECgYBX4HeoIOYJGAkBU7cZIC25h8KUHrSaj81cBbh/+FHLDzFefowvk6oH4pBNNG7q4N34MXplKtghbEqE20FVIevVMAIWBS0wxvDGZhaYCpGqEee7VmN/oUE4RsxUi5Lhlg+KhUOgWhlbICz/cjHupw12uBZ1jZjFJf3b905xVQXFAQJBAN9MQfGAl2LeGRKDregr2cw4lf2PPOrxjfgtkT378eob5Hs2pupk5vXqCaw9tg6yTsBAu/02E3fLZRiU7CZxHVkCQQCTKBMQ3jj82MscsFogdUgd8qkqMf2ABWTMxZ3jU8s+tFwNNWeD9IWqUpu/C2OIHCRdcP5Nl4KcgYU7s+Pi74j5AkB1Ey1r6qj0zE/G9kVi+kLKIUz60XP2FsoBuhpxrjwLK66ir2facybo/lkt9nkSwYgqooYt34FbiMermMEr8piZAkAFKF1qtO84ZXzQ95lhE9tAOXYWZYQmDYpX5wE+q3wvKXEkgV+sb1CUBKsyyfpmFd5sa/5tx8arJ5r82bQ+Cvk5AkBqhNRj8MnYrEr7ApKn926Yw4l3FEJA75Pf5DpOwzds1iIfF/G5hdIzATdzNRYV9eDBAmgt2QaO5LWqeC9bbi1i";
        String sign = sign(message, privateKey);
        System.out.println("字符串为:"+ sign);
        boolean rs = verify(message, pubic, sign);
        if (rs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        System.out.println(genKeyPair2048());
    }

    public static Map<String, String> genKeyPair2048() {
        Map<String, String> keyMap = new HashMap<>();
        try {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048, new SecureRandom());
            KeyPair keyPair = keyPairGen.generateKeyPair();
            RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
            RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
            String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
            String privateKeyString = new String(Base64.encodeBase64(privateKey.getEncoded()));
            keyMap.put("publicKey", publicKeyString);
            keyMap.put("privateKey", privateKeyString);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("{}=======" + ExceptionUtils.getStackTrace(e));
        }
        return keyMap;
    }

    public static Map<String, String> genKeyPair() {
        Map<String, String> keyMap = new HashMap<>();
        try {
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(1024, new SecureRandom());
            KeyPair keyPair = keyPairGen.generateKeyPair();
            RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
            RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
            String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
            String privateKeyString = new String(Base64.encodeBase64(privateKey.getEncoded()));
            keyMap.put("publicKey", publicKeyString);
            keyMap.put("privateKey", privateKeyString);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("{}=======" + ExceptionUtils.getStackTrace(e));
        }
        return keyMap;
    }

    public static String encrypt(String str, String publicKey) {
        String outStr = null;
        try {
            byte[] decoded = Base64.decodeBase64(publicKey);
            RSAPublicKey pubKey = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(1, pubKey);
            outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e) {
            System.err.println("{}===={}===" + publicKey + ",===" + ExceptionUtils.getStackTrace(e));
        }
        return outStr;
    }

    public static String decrypt(String str, String privateKey) throws Exception {
        byte[] inputByte = Base64.decodeBase64(str.getBytes("UTF-8"));
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey priKey = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(2, priKey);
        String outStr = new String(cipher.doFinal(inputByte));
        return outStr;
    }

    public static String sign(String data, String privateKey) {
        String sign = null;
        try {
            byte[] keyBytes = getPrivateKey(privateKey).getEncoded();
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey key = keyFactory.generatePrivate(keySpec);
            Signature signature = Signature.getInstance("MD5withRSA");
            signature.initSign(key);
            signature.update(data.getBytes("utf-8"));
            sign = new String(Base64.encodeBase64(signature.sign()));
        } catch (Exception e) {
            System.err.println("{}===={}===" + privateKey + ",===" + ExceptionUtils.getStackTrace(e));

        }
        return sign;
    }

    public static boolean verify(String srcData, String publicKey, String sign) {
        boolean verify = false;
        try {
            byte[] keyBytes = getPublicKey(publicKey).getEncoded();
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey key = keyFactory.generatePublic(keySpec);
            Signature signature = Signature.getInstance("MD5withRSA");
            signature.initVerify(key);
            signature.update(srcData.getBytes("utf-8"));
            verify = signature.verify(Base64.decodeBase64(sign.getBytes()));
        } catch (Exception e) {
            System.err.println("{}" + publicKey + "===={}===" + ExceptionUtils.getStackTrace(e));
        }
        return verify;
    }

    public static PrivateKey getPrivateKey(String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodedKey = Base64.decodeBase64(privateKey.getBytes());
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedKey);
        return keyFactory.generatePrivate(keySpec);
    }

    public static PublicKey getPublicKey(String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodedKey = Base64.decodeBase64(publicKey.getBytes());
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decodedKey);
        return keyFactory.generatePublic(keySpec);
    }
}
