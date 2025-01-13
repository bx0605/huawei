package com.huaiwei.e.easy;

import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class 英文输入法 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String pre=scanner.nextLine();
        compute(str,pre);
    }
    public static String remove(String ori){
        return ori.replace(".","");
    }
    public static void compute(String str,String pre){
        String str1=str.replace("'"," ");
        Set<String> set=new TreeSet<>();
        String[] strs=str1.split(", ");
        for (int i=0;i< strs.length;i++){
            String [] tmp=strs[i].split(" ");
            if (tmp.length==1){
                set.add(remove(tmp[0]));
            }else {
                for (String tmp1:tmp){
                    set.add(tmp1);
                }

            }
        }
        Set<String> res=new TreeSet<>();
        for (String r:set){
            if (r.startsWith(pre)){
                res.add(r);
            }
        }
        if (res.isEmpty()){
            System.out.println(pre);
        }
        StringJoiner stringJoiner=new StringJoiner(" ");
        res.forEach(a->stringJoiner.add(a));
        System.out.println(stringJoiner);

    }
}
