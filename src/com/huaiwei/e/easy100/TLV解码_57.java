package com.huaiwei.e.easy100;

import java.util.Scanner;

public class TLV解码_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        sc.nextLine();
        String[] arr=sc.nextLine().split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        int len=arr.length;
        int i=0;
        while(i<len){
            int tar=Integer.parseInt(arr[i]);
            int an1=Integer.parseInt(arr[i+1],16);
            int an2=Integer.parseInt(arr[i+2],16);
            int length=an2*256+an1;
            i+=3;
            if(tar==target){
                for (int j=0;j<length;j++){
                    stringBuilder.append(""+arr[i+j]);
                    if (j<length-1){
                        stringBuilder.append(" ");
                    }
                }
            }
            i+=length;
        }
        System.out.println(stringBuilder.toString());
    }
}
