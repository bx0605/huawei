package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 游戏分组_56 {
    public static void main(String[] args) {
        int [] team=new int[10];
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for (int i=0;i<10;i++){
            team[i]=sc.nextInt();
            sum+=team[i];
        }
        int min=Integer.MAX_VALUE;
        for (int a1=0;a1<10;a1++){
            int a11=team[a1];
            for (int a2=a1+1;a2<10;a2++){
                int a22=a11+team[a2];
                for (int a3=a2+1;a3<10;a3++){
                    int a33=a22+team[a3];
                    for (int a4=a3+1;a4<10;a4++){
                        int a44=a33+team[a4];
                        for (int a5=a4+1;a5<10;a5++){
                            int a55=a44+team[a5];
                            min=Math.min(min,Math.abs(sum-a55*2));
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
}
