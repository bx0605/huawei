package com.huaiwei.e.easy;

import java.util.Scanner;

public class 分割数组的最大差值 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int all=0;
        int left=0;
        int res=Integer.MIN_VALUE;
        int [] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            all+=nums[i];
        }
        for (int j=0;j<n;j++){
            left+=nums[j];
            int tmp=all-left;
            if (Math.abs(left-tmp)>res){
                res=Math.abs(left-tmp);
            }
        }
        System.out.println(res);
    }
}
