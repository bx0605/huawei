package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 高矮个子排队_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stu = sc.nextLine();
        List<Integer> res=new ArrayList<>();
        for (String s:stu.split(" ")){
            res.add(Integer.parseInt(s));

        }
        for (int i=1;i<res.size();i++){
            if (i%2==1&&res.get(i)>res.get(i-1)){
                Collections.swap(res,i,i-1);
            }
            if (i%2==0&&res.get(i)<res.get(i-1)){
                Collections.swap(res,i,i-1);
            }
        }
        for (Integer i:res){
            System.out.print(i+" ");
        }
    }
}
