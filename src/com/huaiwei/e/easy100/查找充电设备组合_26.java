package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 查找充电设备组合_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int [] f=new int[m+1];
        int max=0;
        for (int j=0;j<n;j++){
            //向下遍历
            for (int k=m;k>=a[j];k--){
                f[k]=Math.max(f[k],f[k-a[j]]+a[j]);
            }
        }
        System.out.println(f[m]);


    }
}
