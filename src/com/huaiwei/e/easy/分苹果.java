package com.huaiwei.e.easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class 分苹果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int w=0;
        int res[]=new int[n];
        for (int i=0;i<n;i++){
            res[i]=sc.nextInt();
            w^=res[i];
        }
        if (w==0){

            Arrays.sort(res);
            int r=0;
            for (int i=1;i<n;i++){
                r+=res[i];
            }
            System.out.println(r);
        }else{
            System.out.println(-1);
        }

    }
}
