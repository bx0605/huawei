package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class 猜字谜_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputStr=scanner.nextLine();
        String gussStr=scanner.nextLine();
        String[] str=inputStr.split(",");
        String[] guss=gussStr.split(",");
        List<String> res=new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            TreeSet<Character> a = new TreeSet<>();
            for (int k=0;k<str[i].length();k++){
                a.add(str[i].charAt(k));
            }
            String aaa=a.toString();
            for (int j = 0; j < guss.length; j++) {
                TreeSet<Character> b=new TreeSet<Character>();
                for (int h=0;h<guss[j].length();h++){
                    b.add(guss[j].charAt(h));
                }
                String bbb=b.toString();
                if (aaa.equals(bbb)){
                    res.add(guss[j]);
                }
            }

        }
        String join = String.join(",", res);
        System.out.println(join);

    }
}
