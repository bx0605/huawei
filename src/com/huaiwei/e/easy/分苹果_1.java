package com.huaiwei.e.easy;

import java.util.*;

public class 分苹果_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int all=0;
        sc.nextLine();
            List<Integer> r=new ArrayList<>();
        for (int i=0;i<n;i++){
            r.add(sc.nextInt());
        }
        int a=0;
        for (int i=0;i<n;i++){
            a^=r.get(i);
            res+=r.get(i);
        }
        Collections.sort(r);
        if (a==0){
            all=res-r.get(0);
        }
        System.out.println(all);
    }
}
