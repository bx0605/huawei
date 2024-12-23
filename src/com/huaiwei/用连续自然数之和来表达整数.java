package com.huaiwei;

import java.util.Scanner;

public class 用连续自然数之和来表达整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        solve(t);
    }
    public static void solve(int t){
        StringBuilder buff=new StringBuilder();
        int res=0;
        for (int i=0;i<t;i++){
            int nums=i+1;
           if (2*t%nums==0){
               int left=2*t/nums-i;
               if (left<=0){
                   break;
               }
               if(left%2==0){
                   res++;
                   int right=left/2;
                   buff.setLength(0);
                   buff.append(t+"=");
                for(int j=0;j<=i;j++){
                    buff.append(right+"+");
                    right++;
                }
                buff.setLength(buff.length()-1);
                   System.out.println(buff);
               }

               
           }
        }
        System.out.println("result:"+res);
    }
}
