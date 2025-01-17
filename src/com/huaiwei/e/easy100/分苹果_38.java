package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 分苹果_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> all=new ArrayList<>();
        for (int i=0;i<n;i++){
            all.add(sc.nextInt());
        }
        int res=0;
        for (int i=0;i<n;i++){
            res^=all.get(i);
        }
        if (res==0){
            Collections.sort(all);
            int allWeight=0;
            for (int i=1;i<n;i++){
                allWeight+=all.get(i);
            }
            System.out.println(allWeight);
        }else{
            System.out.println(-1);
        }

    }
}
