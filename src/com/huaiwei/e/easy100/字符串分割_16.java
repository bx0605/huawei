package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 字符串分割_16 {
    //定义一个方法，如果字符串大写字母比小写字母多，则将所有小写字母转换为大写字母反之亦然
    public static String changeStr(String s) {
        int sm = 0;
        int big = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isUpperCase(c)) big++;
            if (Character.isLowerCase(c)) sm++;
        }
        if (big > sm) {
            return s.toUpperCase();
        } else if (big < sm) {
            return s.toLowerCase();
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] s = str.split("-");
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 1; i < s.length; i++) {
            s1.append(s[i]);
        }
        System.out.print(s[0]);
        for (int i = 0; i < s1.length(); i++) {
            s2.append(s1.charAt(i));
            if (s2.length() == n) {
                System.out.print("-" + changeStr(s2.toString()));
                s2.setLength(0);
            }
        }
        if (s2.length() > 0) {
            System.out.print("-" + s2);
        }
    }
}
