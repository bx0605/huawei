package com.huaiwei;

import java.util.Scanner;

public class 素数之积 {
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        if (num<2){
            System.out.println("-1 -1");
            return;
        }
        int [] res=factorToPrime(num);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] factorToPrime(int num){
        for (int i=2;i*i<=num;i++){
            if (isPrime(i)&&num%i==0){
                if (isPrime(num/i)){
                    return new int[]{i,num/i};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //判断该数是否为素数
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
