package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 内存资源共享_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        String[] memory=sc.nextLine().split(",");
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            int x = Integer.parseInt(str[i].split(":")[0]);
            int y = Integer.parseInt(str[i].split(":")[1]);
            arr.add(new int[]{x, y});
        }
        int [] memorys=new int[memory.length];
        for (int i = 0; i < memorys.length; i++) {
            memorys[i] = Integer.parseInt(memory[i]);
        }
        boolean[] flags = new boolean[memorys.length];
        arr.sort((x,y)->x[0]-y[0]);
        for(int  h=0;h<memorys.length;h++){
            boolean flag=false;
            for(int j=0;j<arr.size();j++){
                int [] temp=arr.get(j);
                if (temp[0]>=memorys[h]&&temp[1]>=1){
                    int l=temp[1]-1;
                    arr.set(j,new int[]{temp[0],l});
                    flag=true;
                    break;
                }
            }
            flags[h]=flag;
        }
        for(int i=0;i<flags.length;i++){
            if(i<flags.length-1){
                System.out.print(flags[i]+",");
            }else {
                System.out.print(flags[i]);
            }
        }
    }
}
