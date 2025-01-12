package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 最大报酬_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //总工时
        int times=sc.nextInt();
        //工作项
        int items=sc.nextInt();
        sc.nextLine();
        int [] res=new int[times+1];
        for(int i=0;i<items;i++){

            int t=sc.nextInt();
            int w=sc.nextInt();
            for (int j=times;j>=t;j--){
                res[j]=Math.max(res[j],res[j-t]+w);
            }
        }
        System.out.println(res[times]);
    }
}
