package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 货币单位换算_54 {
    //定义方法，用来处理拿到的字符串，得到以元为单位的钱数
    public static double getMoney(String str,int x,int y){
        Double result = Double.parseDouble(str.substring(x,y));
        char ch = str.charAt(y);

        if (ch=='f') result= result/100;
        if (ch=='J') result= result/18.25;
        if (ch=='s') result= result/18.25/100;
        if (ch=='H') result= result/1.23;
        if (ch=='c') result= result/1.23/100;
        if (ch=='E') result= result/0.14;
        if (ch=='e') result= result/0.14/100;
        if (ch=='G') result= result/0.12;
        if (ch=='p') result= result/0.12/100;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
sc.nextLine();
        double sum=0;
        while(n-->0){
            int x=0;
            int y=0;
            String str = sc.nextLine();
            while(str.charAt(x)>='0'&&str.charAt(x)<='9'||str.charAt(x)=='.'){
                x++;
            }
            y=x;
            while(y<str.length()&&(str.charAt(y)>='a'&&str.charAt(y)<='z'||str.charAt(y)>='A'&&str.charAt(y)<='Z')){
                y++;
            }
            if (y==str.length()) {
                sum+=getMoney(str,0,x);
            }else{
                sum+=getMoney(str,0,x);
                x=y;
                while(str.charAt(x)>='0'&&str.charAt(x)<='9'||str.charAt(x)=='.'){
                    x++;
                }
                sum+=getMoney(str,y,x);
            }
        }
        long res=(long)(sum*100);
        System.out.println(res);
    }
}
