package com.huaiwei.e.easy100;

import java.util.Arrays;
import java.util.Scanner;

public class 预定酒店_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        Integer [] prices=new Integer[n];
        for (int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        Arrays.sort(prices,(a,b)->{
            int ax=Math.abs(a-x);
            int bx=Math.abs(b-x);
            if (ax!=bx){
                return ax-bx;
            }else{
                return a.compareTo(b);
            }

        });
        int [] res=new int[k];
        for (int l=0;l<k;l++){
            res[l]=prices[l];
        }
        Arrays.sort(res);
        for (int j:res){
            System.out.print(j+" ");
        }
    }
}
