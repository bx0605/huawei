package com.huaiwei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 查找接口成功率最优时间段 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minAverageLost=sc.nextInt();
        sc.nextLine();
        String[] allNums=sc.nextLine().split(" ");
        List<int []> res=new ArrayList<>();

        for (int i=0;i<allNums.length-1;i++){
            int tmp=Integer.parseInt(allNums[i]);
            if (tmp>minAverageLost) {
                continue;
            }
            for (int j=i+1;j< allNums.length;j++){
                tmp=tmp+Integer.parseInt(allNums[j]);
                if (tmp>minAverageLost*(j-i+1)){
                    if (j-i==1){
                        break;
                    }else {
                    int[] r = new int[]{i, j-1};
                    res.add(r);
                    break;
                    }
                }
                if (j==allNums.length-1){
                if (tmp<=minAverageLost*(j-i+1)){
                        int[] r = new int[]{i, j};
                        res.add(r);
                        break;
                    }
                }
            }
        }
        int maxLength=0;
        for (int[] i:res){
            maxLength=Math.max(i[1]-i[0]+1,maxLength);
        }
        if (maxLength==0){
            System.out.println("NULL");
        }else {
            for (int[] i:res){
                if (i[1]-i[0]+1==maxLength){
                    System.out.print(i[0]+"-"+i[1]+" ");
                }
            }
        }
    }
}
