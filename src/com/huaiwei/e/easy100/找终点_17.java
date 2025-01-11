package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 找终点_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        //初始化总次数为最大值
        int ans=Integer.MAX_VALUE;

        for (int i=0;i< str.length/2;i++){
            int let=1;

            int k=i;
            while(k< str.length-1){
                k=Integer.parseInt(str[k])+k;
                if (k>str.length-1){
                    let=Integer.MAX_VALUE;
                    break;
                }
                let++;
            }
             ans = Math.min(let, ans);
        }
        if (ans==Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(ans);
        }

    }
}
