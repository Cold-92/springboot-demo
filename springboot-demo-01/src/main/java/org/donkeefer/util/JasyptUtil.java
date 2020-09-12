package org.donkeefer.util;

import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.TextEncryptor;

public class JasyptUtil {

    /**
     * 加密密文：
     *     NB7CuLBqHk2Tclus/OmTIw==
     *     zdqDJevZJgx8FmKxqgVlEw==
     */
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123");
        String userName = encryptor.encrypt("john");
        String password = encryptor.encrypt("123456");
        System.out.println(userName);
        System.out.println(password);
    }

}
