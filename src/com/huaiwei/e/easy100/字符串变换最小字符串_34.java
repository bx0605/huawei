package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 字符串变换最小字符串_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char a='z';
            int j=-1;
            for (int k = i; k < chars.length; k++) {
                if (chars[k]<a){
                    a=chars[k];
                    j=k;
                }

            }
            if (j==-1||a=='z'){
                continue;
            }
            char tmp=a;
            chars[j]=chars[i];
            chars[i]=a;
            System.out.println(String.valueOf(chars));
            return;
        }
        System.out.println(str);
    }
}
