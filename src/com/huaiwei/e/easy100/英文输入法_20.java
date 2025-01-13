package com.huaiwei.e.easy100;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 英文输入法_20 {
    //编写一个方法，将输入字符串中所有应为祖父字串存储到List集合中
    public static List<String> getStr(String str){
        List<String> res=new ArrayList<>();
        StringBuilder ss=new StringBuilder();
        for (Character c:str.toCharArray()){
            if (Character.isLetter(c)){
                ss.append(c);
            }else {
                if (ss.length()>0){
                    res.add(ss.toString());
                    ss.setLength(0);
                }
            }
        }
        if (ss.length()>0){
            res.add(ss.toString());
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        List<String> tmp=getStr(s);
        List<String> res=new ArrayList<>();
        for (String ss:tmp){
            if (ss.length()>t.length()&&ss.startsWith(t)){
                res.add(ss);
            }
        }
        Collections.sort(res);
        if (res.isEmpty()){
            System.out.println(t);
        }else {
            for (String sss : res) {
                System.out.print(sss + " ");
            }
        }
    }
}
