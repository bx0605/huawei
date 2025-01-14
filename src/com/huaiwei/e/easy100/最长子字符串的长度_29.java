package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 最长子字符串的长度_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for (Character c:str.toCharArray()){
            if (c=='o'){
                count++;
            }
        }
        System.out.println(count%2==0?str.length():str.length()-1);
    }
}
