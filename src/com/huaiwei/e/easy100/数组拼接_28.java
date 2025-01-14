package com.huaiwei.e.easy100;

import java.util.*;

public class 数组拼接_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //每次取数组中的个数
        int n=sc.nextInt();
        //数组个数
        int m=sc.nextInt();
        sc.nextLine();
        List<Integer> res=new ArrayList<>();
        List<Queue<Integer>> list=new LinkedList<>();
        for (int i=0;i<m;i++){
            Queue<Integer> q=new LinkedList<>();
            String [] tmp=sc.nextLine().split(",");
            for (String s:tmp){
                q.offer(Integer.parseInt(s));
            }
            list.add(q);
        }

        while(true){
            boolean flag=true;
            for (Queue<Integer> queue:list){
            for (int i=0;i<n&&!queue.isEmpty();i++){
                res.add(queue.poll());
                flag=false;
            }
            }
            if (flag){
                break;
            }
        }
        for (int i=0;i<res.size();i++){
            if (i!=res.size()-1){
                System.out.print(res.get(i)+",");
            }else {
                System.out.print(res.get(i));
            }

        }
    }
}
