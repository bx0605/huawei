package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 简单的自动曝光_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> img= new ArrayList<>();
        while (sc.hasNextInt()) {
            img.add(sc.nextInt());
        }
        sc.close();
        int max=Integer.MAX_VALUE;
        int index=-1;
        for (int i=-255;i<=255;i++){
            int sum=0;
            for(int h:img){
                int p=h+i;
                if(p<0){
                    p=0;
                }
                if (p>255){
                    p=255;
                }
                sum+=p;
            }
            int diff=Math.abs(sum-128*img.size());
            if(diff<max){
                max=diff;
                index=i;
            }
        }
        System.out.println(index);
    }
}
