package com.huaiwei.e.easy100;

import java.util.*;

public class 报数游戏_45 {
    public static void main(String[] args) {
       int n= new Scanner(System.in).nextInt();
       if (n <2||n>99){
           System.out.println("error");
       }
       //创建一个双端队列
        Queue<Integer> queue = new ArrayDeque<>();
       for (int i = 1; i <= 100; i++) {
           queue.add(i);
       }
       while (queue.size()>=n){
           for (int i=0;i<n-1;i++){
               int f=queue.poll();
               queue.add(f);
           }
           queue.poll();
       }

        List<Integer> list = new ArrayList<>(queue);
       Collections.sort(list);
       for (int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i)+" ");
       }
    }
}
