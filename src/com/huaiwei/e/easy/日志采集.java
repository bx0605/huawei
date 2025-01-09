package com.huaiwei.e.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 日志采集 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> scannerores=new ArrayList<>();
        String tmp=scanner.nextLine();
        for(String s:tmp.split(" ")){
            scannerores.add(Integer.valueOf(s));
        }
        int maxscannerore=0;
        int currentLog=0;
        int totalDelay=0;

        for (int i=0;i<scannerores.size();i++){
            totalDelay+=currentLog;
            currentLog+=scannerores.get(i);
            if (currentLog>=100){
                maxscannerore=Math.max(maxscannerore,(100-totalDelay));
            }else {
                maxscannerore=Math.max(maxscannerore,currentLog-totalDelay);
            }
        }
        System.out.println(maxscannerore);
    }
}
