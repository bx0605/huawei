package com.huaiwei.e.easy;

import java.util.Scanner;

public class 分割数组的最大值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int [] nums=new int[n];
        int t=0;
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            t+=nums[i];
        }
        int l=0;
        int res=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            l+=nums[i];
            int r=t-l;
            res=Math.max(res,Math.abs(l-r));
        }
        System.out.println(res);
    }
}
