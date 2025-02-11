package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 分割数组最大差值_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int leftNums=0;
        int totalNums=0;
        int maxNum=0;
        int [] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            totalNums += nums[i];
        }
       for (int i = 0; i < n; i++){
          leftNums += nums[i];
          int rightNum = totalNums - leftNums;
          maxNum = Math.max(maxNum, Math.abs(leftNums-rightNum));
       }
        System.out.println(maxNum);
    }
}
