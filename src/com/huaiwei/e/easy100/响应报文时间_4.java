package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 响应报文时间_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        long minTime=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            //读取每个报文的时间
            int T=sc.nextInt();
            //读取最大的响应时间
            int M=sc.nextInt();
            long maxResponseTime=getBwTime(M);
            long responseTime=maxResponseTime+T;
            if (responseTime<minTime){
                minTime=responseTime;
            }
        }
        System.out.println(minTime);
    }
    //定义计算报文响应时间的方法
    public static long getBwTime(int maxRespTime){
        if (maxRespTime<128){
            return maxRespTime;
        }else {
            //获取第4位
            long mant=maxRespTime&0x0F;
            //获取高三位
            long exp=(maxRespTime>>4)&0x07;
            return (mant|0x10)<<(exp+3);
        }
    }
}
