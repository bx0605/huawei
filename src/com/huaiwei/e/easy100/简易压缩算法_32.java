package com.huaiwei.e.easy100;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class 简易压缩算法_32 {

    public static String save(String str){
        StringBuilder res=new StringBuilder();
        char lastChar=0;
        int i=0;
        while (i<str.length()){
            if (Character.isDigit(str.charAt(i))&&str.charAt(i)!='0'){
                int count=0;
                while(i<str.length()&&Character.isDigit(str.charAt(i))){
                    count=count*10+(str.charAt(i)-'0');
                    i++;
                }
                if (i<str.length()&&count>2&&Character.isLowerCase(str.charAt(i))){
                    for (int j=0;j<count;j++){
                        res.append(str.charAt(i));
                    }
                    lastChar=str.charAt(i);
                    i++;
                }else {
                    return "error";
                }
            }else if (Character.isLowerCase(str.charAt(i))){
                int num=1;
                char currChar=str.charAt(i);
                i++;
                while(i<str.length()&&currChar==str.charAt(i)){
                    num++;
                    i++;
                }
                if (num>2||currChar==lastChar){
                    return "error";
                }
                lastChar=currChar;
                    for (int k=0;k<num;k++){
                        res.append(currChar);
                    }

            }else {
                return "error";
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String save = save(s);
        System.out.println(save);

    }
}
