package com.main.util;

import java.util.Random;

public class CodeGenerator {

    public static void main(String[] args) {
        String string1 = "abcdefghijklmnopqrstuvwxyz";
        String string2 = "ghijklmnopqrsabcdeftuvwxyz";
        String string3 = "abqrstuvwxyzcdefghijklmnop";
        String string4 = "fghijkabcrstuvwxyzdelmnopq";
        for (int i = 0; i < 10; i++) {
            String codeGenerator1 = codeGenerator(string1);
            String codeGenerator2 = codeGenerator(string2);
            String codeGenerator3 = codeGenerator(string3);
            String codeGenerator4 = codeGenerator(string4);
            System.out.println("code :- " + codeGenerator1 + "-" + codeGenerator2 + "-" + codeGenerator3 + "-" + codeGenerator4);
        }

        /*
         code :- 1d56-df82-5bad-0530
         code :- 1ac8-f4b2-ad78-c498
         code :- 3af8-2dba-6b33-a427
         code :- 1b9f-eac4-f9b0-a0b8
         code :- 6d19-8705-c103-4e68
         code :- e97f-d5b3-10a7-9bc4
         */
    }

    public static String codeGenerator(String code) {
        String string = new String();
        for (int index = 0; index < 10; index++) {
            try {
                Thread.sleep(1200);
                char[] chars = (System.currentTimeMillis() + code).toCharArray();
                StringBuilder sb = new StringBuilder();
                Random random = new Random();
                for (int i = 0; i < 8; i++) {
                    char c = chars[random.nextInt(chars.length)];
                    sb.append(c);
                }
                String output = sb.toString();
                return Md5Encryption.main(output).substring(0, 4);
            } catch (Exception e) {
            }
        }
        return string;
    }
}
