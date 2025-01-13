package com.huaiwei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 整数对最小和 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String num1=scanner.nextLine();
        String num2=scanner.nextLine();
        int k=scanner.nextInt();
        int len1=Integer.parseInt(num1.split(" ")[0]);
        int len2=Integer.parseInt(num2.split(" ")[0]);
        int [] arr1=new int[len1];
        int [] arr2=new int[len2];
        for (int i=0;i<len1;i++){
            arr1[i]=Integer.parseInt(num1.split(" ")[i+1]);
        }
        for (int i=0;i<len2;i++){
            arr2[i]=Integer.parseInt(num2.split(" ")[i+1]);
        }
        int [] res=new int[len1*len2];
        for(int i=0;i<len1*len2;i++){
            res[i]=Integer.MAX_VALUE;
        }
        int l=0;
        for (int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){
               res [l++]=arr1[i]+arr2[j];
            }
        }

        Arrays.sort(res);
        int nums=0;
        for (int i=0;i<k;i++){
           nums+=res[i];
        }
        System.out.println(nums);
    }
}
