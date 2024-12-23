package com.huaiwei;

import java.util.Scanner;

public class 靠谱的车 {
   public static int count=0;
    public static void main(String[] args) {
        int n=Integer.valueOf(new Scanner(System.in).nextLine());
        res(n);
        System.out.println(count);
    }

    public static void res(int i){
        while(i>0){
            if (String.valueOf(i).contains("4")){
             i=Integer.parseInt(String.valueOf(i).replace("4","3"));
            }
            i--;
           count++;
        }
    }
}
