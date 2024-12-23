package com.huaiwei.e.easy;

import java.util.Scanner;

public class 贪心的商人 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入商品的数量
        int nums = sc.nextInt();
        //输入商品的售货天数
        int days= sc.nextInt();
        //输入仓库做多持有的每件商品的数量
        int[] items=new int[nums];
        for (int l=0;l<nums;l++){
            items[l]=sc.nextInt();
        }
        int all=0;
        for (int i=0;i<nums;i++){
            int res=0;
            int [] price=new int[days];
            for (int k=0;k<days;k++)
                price[k]=sc.nextInt();
            for (int j=0;j<days-1;j++){
                if (price[j]<price[j+1]){
                    res+=(price[j+1]-price[j]);
                }
            }
            all+=res*items[i];
        }
        System.out.println(all);
    }
}
