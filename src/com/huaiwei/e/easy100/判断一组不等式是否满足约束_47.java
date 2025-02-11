package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 判断一组不等式是否满足约束_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str=sc.nextLine().split(";");
        int length=str.length;
        List<String[]> list=new ArrayList<>();
        for (int i=0;i<length-3;i++){
            list.add(str[i].split(","));
        }

        String[] xArr=str[length-3].split(",");
        String[] bArr=str[length-2].split(",");
        String[] condition=str[length-1].split(",");

        boolean flag= true;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            String [] l=list.get(i);
            int sum=0;
            for (int k=0;k<l.length;k++){
            sum+=Double.parseDouble(l[k])*Integer.parseInt(xArr[k]);
            }

            int temp=(int)(sum-Double.parseDouble(bArr[i])+0.6);
            max=Math.max(max,temp);

            switch(condition[i]){
                case ">":
                    flag=flag&sum>Double.parseDouble(bArr[i]);
                    break;
                case ">=":
                    flag=flag&sum>=Double.parseDouble(bArr[i]);
                    break;
                case "<":
                    flag=flag&sum<Double.parseDouble(bArr[i]);
                    break;
                case "<=":
                    flag=flag&sum<=Double.parseDouble(bArr[i]);
                    break;
                case "=":
                    flag=flag&sum==Double.parseDouble(bArr[i]);
                    break;
                default:
            }
        }
        System.out.println(flag+" "+max);
    }
}
