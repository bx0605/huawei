package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 跳房子_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //每回合可能的连续步数
        String steps=sc.nextLine();
        //房子总格数
        int i=sc.nextInt();
        String[] split = steps.replace("[", "").replace("]", "").split(",");
        //定义最大步长总和
        int maxStep=Integer.MAX_VALUE;
        //定义两个步长下标
        int x=0,y=0;
        for (int j=0;j<split.length-1;j++){
            for (int k=j+1;k<split.length;k++){
                if (Integer.parseInt(split[j])+Integer.parseInt(split[k])==i){
                    if (maxStep>j+k){
                        maxStep=j+k;
                        x=Integer.parseInt(split[j]);
                        y=Integer.parseInt(split[k]);
                    }
                }
            }
        }
        System.out.println("["+x+","+y+"]");
    }
}
