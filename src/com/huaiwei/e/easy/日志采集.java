package com.huaiwei.e.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 日志采集 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> scores=new ArrayList<>();
        String tmp=sc.nextLine();
        for(String s:tmp.split(" ")){
            scores.add(Integer.valueOf(s));
        }
        int maxScore=0;
        int currentLog=0;
        int totalDelay=0;

        for (int i=0;i<scores.size();i++){
            totalDelay+=currentLog;
            currentLog+=scores.get(i);
            if (currentLog>=100){
                maxScore=Math.max(maxScore,(100-totalDelay));
            }else {
                maxScore=Math.max(maxScore,currentLog-totalDelay);
            }
        }
        System.out.println(maxScore);
    }
}
