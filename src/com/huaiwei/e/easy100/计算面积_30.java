package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 计算面积_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n+2][2];
        for (int i=1;i<n+1;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        arr[0][0]=0;
        arr[0][1]=0;
        arr[n+1][0]=m;
        arr[n+1][1]=0;

        int res=0;
        int y=0;
        for (int j=1;j<arr.length;j++){
            res+=Math.abs(y)*(arr[j][0]-arr[j-1][0]);
            y+=arr[j][1];
        }
        System.out.println(res);
    }
}
