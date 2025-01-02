package com.huaiwei.e.easy;
import java.util.*;

public class 猜字谜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接收谜面单词泪飙
        String[] a=sc.nextLine().split(",");
        //接收谜底单词列表
        String[] b=sc.nextLine().split(",");
        //创建一个ArrayList用于存储结果集
        ArrayList<String> resList = new ArrayList<>();
        //标记是否已经找到谜底
        boolean flag=false;
        for (String aa:a){
            //TreeSet具有去重排序功能，只要两个字符串去重排序后相等，即可将匹配的字符串加入到结果集合中
            TreeSet<Character> aTree = new TreeSet<>();
            for (Character c:aa.toCharArray()) aTree.add(c);
           String aaa= aTree.toString();
            for (String bb:b){
                TreeSet<Character> bTree=new TreeSet<>();
                for (Character d:bb.toCharArray()) bTree.add(d);
                String bbb=bTree.toString();
                if (bbb.equals(aaa)){
                    flag=true;
                    resList.add(bb);
                }
            }
        }
        if (!flag){
            resList.add("not found");
        }
        String res = String.join(",", resList);
        System.out.println(res);
    }
}
