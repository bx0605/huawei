package com.huaiwei.e.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 孙悟空吃蟠桃 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //第一行输入每棵树上蟠桃的数量
        String line=scanner.nextLine();
        List<Integer> list=new ArrayList<>();
        for (String i:line.split(" ")){
            list.add(Integer.valueOf(i));
        }
        //第二行输入守卫离开的时间
        Integer tim=scanner.nextInt();
        if (tim< list.size()){
            System.out.println(0);
            }else{
            int l=1,r=10000;
            while (l<=r){
                int t=0;
                int m=(l+r)/2;
                for (Integer i:list){
                    t+=(i+m-1)/m;
                }
                if (t>tim){
                    l=m+1;
                }else {
                    r=m-1;
                }
                if (l>r){
                    System.out.println(m);
                }
            }
        }
    }
}
