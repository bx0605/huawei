package com.huaiwei.e.easy;

import java.util.Scanner;

public class 分糖果 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int candies=scanner.nextInt();
        int steps=0;
        while(candies>1){
            if (candies%2==0){
                candies/=2;
            }else {
                if (candies==3||(candies&2)==0){
                    candies--;
                }else {
                    candies++;
                }
            }
            steps++;
        }
        System.out.println(steps);
    }
}
