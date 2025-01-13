package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 最小的调整次数_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            str[i] = sc.nextLine();
        }
        int res = 0;
        int size = 0;
        boolean flag = false;
        for (String s : str) {
            if (s.contains("remove")) {
                size--;
                if (flag) {
                    res++;
                    flag = false;
                }
            } else {
                if (s.contains("head")) {
                    if (size > 0) {
                        flag = true;
                    }
                    size++;
                } else {
                    size++;
                }
            }
        }
        System.out.println(res);

    }
}
