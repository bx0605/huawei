package com.huaiwei.e.easy;

import java.util.Scanner;

public class 靠谱的车 {
    public static void main(String[] args) {
//思路：将数字当成字符串，将字符串中的4转化为3
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int count=0;
        for (int k=i;k>0;k--){
            k=check(k);
            count++;
        }
        System.out.println(count);
    }

    public static int check(Integer num){
        String replace = num.toString().replace('4', '3');
        int i = Integer.parseInt(replace);
        return i;
    }
}
