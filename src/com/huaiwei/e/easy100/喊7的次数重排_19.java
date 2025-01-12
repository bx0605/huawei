package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 喊7的次数重排_19 {
    //定义一个用来判断当前数是否是7的倍数或者包含7
    public static boolean isSeven(int num){
        if (num%7==0){
            return true;
        }else {
            while (num>0){
                if (num%10==7) return true;
                num/=10;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int all=0;
        int n=str.length;
        for (String s:str){
            all+=Integer.parseInt(s);
        }

        int a=1;
        int i=0;
        int [] res=new int[n];
        while(all>0){
            if (isSeven(a)){
                res[i]=res[i]+1;
                all--;
            }
            i=(i+1)%n;
            a++;
        }

        for (int h:res){
            System.out.print(h+" ");
        }
    }
}
