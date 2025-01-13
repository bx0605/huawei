package com.huaiwei.e.easy100;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 数大雁_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //定义一个队列，用来存储并列大雁的所有位置
        Queue<Integer> list=new LinkedList<>();
        int [] res=new int[s.length()+1];
        int q=0,u=0,a=0,c=0,k=0,r=0;
        for (int i=0;i<s.length();i++){
            res[i+1]=res[i];
            char j=s.charAt(i);
            if (j=='q'){
                list.offer(i);
                q++;
            }else if (j=='u'&&q>u){
                u++;
            }else if(j=='a'&&u>a){
                a++;
            }else if (j=='c'&&a>c){
                c++;
            }else if (j=='k'&&c>k){
                k++;
                res[i+1]++;
                Integer first = list.poll();
                r=Math.max(r,res[i+1]-res[first]);
            }else if (j !='q' ||j !='u' ||j !='a' ||j !='c' ||j !='k'){
                System.out.println(-1);
            }
        }
        System.out.println(r==0?-1:r);
    }
}
