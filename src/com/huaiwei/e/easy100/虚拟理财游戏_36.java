package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 虚拟理财游戏_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //树的总量
        int nums=sc.nextInt();
        //未成活的树总量
        int m=sc.nextInt();
        int[] trees=new int[nums];
        for (int i=0;i<m;i++){
            int k=sc.nextInt();
            //未成活的树的位置为1
            trees[k-1]=1;
        }
        //总的补种数
        int all=sc.nextInt();
        int ans=0,cnt=0,j=0;
        for (int i=0;i<nums;i++){
            cnt+=trees[i];
            while(cnt>all){
                cnt-=trees[j];
                j++;
                }
            if (i-j+1>ans){
                ans=i-j+1;
            }
        }
        System.out.println(ans);
    }
}
