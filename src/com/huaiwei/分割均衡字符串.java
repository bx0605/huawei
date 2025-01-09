package com.huaiwei;

import java.util.Scanner;

public class 分割均衡字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        int left=0;
        int right=0;
        int nums=0;
        for (int i=0;i<line.length();i++){
         if (line.charAt(i)=='X'){
             ++left;
         }else {
             ++right;
         }
         if (left==right){
             nums++;
         }
        }
        System.out.println(nums);
    }
}
