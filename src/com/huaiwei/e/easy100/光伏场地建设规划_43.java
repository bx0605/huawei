package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 光伏场地建设规划_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //调研地区的长
        int c=sc.nextInt();
        //调研地区的宽
        int k=sc.nextInt();
        //正方形边长
        int m=sc.nextInt();
        //最低发电量
        int s=sc.nextInt();
        int [][] power=new int[c][k];
        int res=0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < k; j++) {
                power[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i <= c-m; i++) {
            for (int j = 0; j <= k-m; j++) {
                int cnt=0;
                for (int l = 0; l < m; l++) {
                    for (int r = 0; r < m; r++) {
                        cnt+=power[r+i][l+j];
                    }
                }
                if (cnt>=s){
                   res++;
                }
            }
        }
        System.out.println(res);
    }
}
