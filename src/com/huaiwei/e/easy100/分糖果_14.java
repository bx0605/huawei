package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 分糖果_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1) System.out.println(0);
        int step=0;
        while(n>1){
            if (n%2==0){

                n/=2;
            }else {

                if (n == 3 || (n & 2) == 0) {
                    n--;
                } else {
                    n++;
                }
            }
            step++;
        }
        System.out.println(step);
    }
}
