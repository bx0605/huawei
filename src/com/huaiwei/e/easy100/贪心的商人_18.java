package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 贪心的商人_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //商品的数量
        int number = sc.nextInt();
        //所有商品的售货天数
        int days = sc.nextInt();
        sc.nextLine();
        //每件商品的最大持有量
        String item=sc.nextLine();
        int [][] item_price=new int[number][days];
        for (int i=0;i<number;i++){
            for (int j=0;j<days;j++){
                item_price[i][j]=sc.nextInt();
            }
        }
        int [] profit=new int[number];
        for (int k=0;k<number;k++){
            int h=0;
            for (int l=1;l<days;l++){
                if (item_price[k][l]-item_price[k][l-1]>0){
                    h+=(item_price[k][l]-item_price[k][l-1]);
                }
            }
            profit[k]=h;
        }
        int res=0;
        for (int g=0;g<number;g++){
            res+=(Integer.parseInt(item.split(" ")[g])*profit[g]);
        }
        System.out.println(res);
    }
}
