package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 整数对最小和_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //第一个列表
        int first = sc.nextInt();
        int [] f=new int[first];
        for (int i=0;i<first;i++){
            f[i]=sc.nextInt();
        }

        int second = sc.nextInt();
        int [] s=new int[second];
        for (int i=0;i<second;i++){
            s[i]=sc.nextInt();
        }

        List<Integer> res=new ArrayList<>();
        for (int i:f){
            for (int j:s){
                res.add(i+j);
            }
        }
        Collections.sort(res);
       int k= sc.nextInt();
       int result=0;
       for (int i=0;i<k;i++){
           result+=res.get(i);
       }
        System.out.println(result);
    }
}
