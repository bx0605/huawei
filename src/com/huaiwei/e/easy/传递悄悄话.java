package com.huaiwei.e.easy;

import java.util.Scanner;

public class 传递悄悄话 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] a=new int[s1.length+1];
        for (int i = 0; i < s1.length; i++) {
            a[i+1]=Integer.parseInt(s1[i]);
        }
        System.out.println(dfs(1,a));
    }
    public static int dfs(int u,int [] v){
        if (u>=v.length||v[u]==-1){
            return 0;
        }
        return v[u]+Math.max(dfs(u*2,v),dfs(u*2+1,v));
    }





}
