package com.huaiwei.e.easy;

import java.util.*;

public class 流浪地球 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //发动机总数
        int N=scanner.nextInt();
        //计划启动的发动机个数
        int E=scanner.nextInt();
        int [] startTime=new int[N];
        //首先将每个启动时间设置位最大值
        Arrays.fill(startTime,1001);
        for (int i=0;i<E;i++){
            //启动时间
            int t=scanner.nextInt();
            //启动机器编号
            int p=scanner.nextInt();
            startTime[p]=t;
        }
        //双循环遍历，给出每个发动机的启动时间
        for (int j=0;j<N;j++){
            for (int k=0;k<N;k++){
                startTime[k]=Math.min(startTime[k],startTime[j]+Math.abs(j-k));
            }
        }
        List<Integer> res=new ArrayList<>();
        //找出最晚启动的发动机
        int maxTime=0;
        for (int i=0;i<N;i++){
            if (maxTime>startTime[i]){
                continue;
            }
            if (maxTime<startTime[i]){
                maxTime=startTime[i];
                res.clear();
            }
            res.add(i);
        }
        Collections.sort(res);
        System.out.println(res.size());
       StringJoiner joiner=new StringJoiner(" ");
       res.stream().forEach(x->joiner.add(x.toString()));
        System.out.println(joiner);
    }
}
