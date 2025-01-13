package com.huaiwei;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 寻找身高相近的小朋友 {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        int mingHeight=scanner.nextInt();
        int numFriends=scanner.nextInt();
        List<Integer> firendLists=new ArrayList<>();
        for (int i=0;i<numFriends;i++){
            firendLists.add(scanner.nextInt());
        }
        firendLists.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1 - mingHeight);
                int abs2 = Math.abs(o2 - mingHeight);
                if (abs1!=abs2) {
                    return abs1 - abs2;
                }
                return o1-o2;
            }
        });

        for (int i:firendLists){
            System.out.print(i+" ");
        }
    }
}
