package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 第K个排列_9 {
    //定义方法，递归地将List列表中的所有数组已从小到达的顺序排列出来

    /**
     *
     * @param res 原始队列
     * @param i 队列首位数字
     * @param q 结果队列组合
     */
    public static void generateQueue(List<Integer> res,int i,List<List<Integer>> q){
        if (i==res.size()-1){
            q.add(new ArrayList<>(res));
            return;
        }
        for (int j=i;j<res.size();j++){
            //交换队列中数字的位置
            Collections.swap(res,i,j);
            generateQueue(res,i+1,q);
            //复原位置
            Collections.swap(res,i,j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int l=1;l<=n;l++){
            list.add(l);
        }
        List<List<Integer>> res=new ArrayList<>();
        generateQueue(list,0,res);
        for (Integer h:res.get(k-1)){
            System.out.print(h);
        }

    }
}
