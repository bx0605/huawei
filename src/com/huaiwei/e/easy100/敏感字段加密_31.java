package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 敏感字段加密_31 {
    //编写一个方法，用来将指定字符串替换为List<String>集合
    public static List<String> transStr(String s){
        List<String> res=new ArrayList<>();
        boolean flag=false;
        StringBuilder stringBuilder=new StringBuilder();
        for (char c:s.toCharArray()){
            if (c=='"'){
                flag=!flag;
                stringBuilder.append(c);
            }else if (c=='_'&&!flag){
                res.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }else {
                stringBuilder.append(c);
            }
        }
        if (stringBuilder.length()>0){
            res.add(stringBuilder.toString());

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        List<String> res=transStr(s);
        if (n<0||n>=res.size()){
            System.out.println("ERROR");
        }else {
            res.set(n,"******");
        }
        boolean flag=true;
        for (String str:res){
            if (flag) {
                System.out.print(str);
                System.out.print("_");
            }else {
                System.out.print(str);
            }
            flag=!flag;
        }
    }
}
