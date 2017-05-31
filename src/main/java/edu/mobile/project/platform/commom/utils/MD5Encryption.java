package edu.mobile.project.platform.commom.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Encryption {
    private static final char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static MessageDigest messageDigest = null;
    static {
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var1) {
            var1.printStackTrace();
        }

    }

    public MD5Encryption() {
    }

    public static String getFileMD5String(File file) throws IOException {
        String ret = "";
        FileInputStream in = null;
        FileChannel ch = null;

        try {
            in = new FileInputStream(file);
            ch = in.getChannel();
            MappedByteBuffer byteBuffer = ch.map(MapMode.READ_ONLY, 0L, file.length());
            messageDigest.update(byteBuffer);
            ret = bytesToHex(messageDigest.digest());
        } finally {
            if (in != null) {
                in.close();
            }

            if (ch != null) {
                ch.close();
            }

        }

        return ret;
    }

    public static String getMD5String(String str) {
        return getMD5String(str.getBytes());
    }

    public static String getMD5String(byte[] bytes) {
        messageDigest.update(bytes);
        return bytesToHex(messageDigest.digest());
    }

    public static boolean checkPassword(String pwd, String md5) {
        return getMD5String(pwd).equalsIgnoreCase(md5);
    }

    public static boolean checkPassword(char[] pwd, String md5) {
        return checkPassword(new String(pwd), md5);
    }

    public static boolean checkFileMD5(File file, String md5) throws IOException {
        return getFileMD5String(file).equalsIgnoreCase(md5);
    }

    public static String bytesToHex(byte[] bytes) {
        return bytesToHex(bytes, 0, bytes.length);
    }

    public static String bytesToHex(byte[] bytes, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < start + end; ++i) {
            sb.append(byteToHex(bytes[i]));
        }

        return sb.toString();
    }

    public static String byteToHex(byte bt) {
        return String.valueOf(HEX_DIGITS[(bt & 240) >> 4]) + HEX_DIGITS[bt & 15];
    }

    public static String encryptAddSalt(String password, Long timeMillis) {
        String firstMd5 = getMD5String((password + timeMillis).getBytes());
        firstMd5 = firstMd5.substring(25, 32) + firstMd5.substring(0, 25);
        return getMD5String(firstMd5.getBytes());
    }

    public static String encrypt(String username, String password) {
        String firstMd5 = getMD5String((username + password).getBytes()).toLowerCase();
        firstMd5 = firstMd5.substring(8, 32) + firstMd5.substring(0, 8);
        return getMD5String(firstMd5.getBytes()).toLowerCase();
    }
}

