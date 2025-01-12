package com.huaiwei.e.easy100;

import java.util.*;

public class 日志采集_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        int max=Integer.MIN_VALUE;
        int curr=0;
        int logs=0;
        for (int log:list ){
            curr+=logs;
            logs+=log;
            if (logs>=100){
                max=Math.max(max,100-curr);
            }
            max=Math.max(max,logs-curr);
        }
        System.out.println(max);
    }
}
