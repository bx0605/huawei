package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 工号不够用了怎么办_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long k=(long)Math.pow(26,m);
        int res=1;
        while(k*Math.pow(10,res)<n){
            res++;
        }
        System.out.println(res);
    }
}
