package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 猜数字_22 {
    //定义一个方法，实现判断待猜测的数字和给定数字是否符合要求


//    public static boolean guss(int a,int b,int c,int d){
//        int[] aaa=new int [10];
//        int[] bbb=new int [10];
//        for (int i=0;i<4;i++){
//            //a的最后一位
//            int aa=a%10;
//            //b的最后一位
//            int bb=b%10;
//            a/=10;
//            b/=10;
//            if (aa==bb){
//                c--;
//            }else {
//                aaa[aa]+=1;
//                bbb[bb]+=1;
//            }
//
//        }
//        for (int i=0;i<10;i++){
//            d-=Math.min(aaa[i],bbb[i]);
//        }
//        return c==0&&d==0;
//    }
    static boolean guss(int s, int t, int a, int b) {
        int[] va = new int[10]; // 用于记录当前数字各数字出现的次数（0-9）
        int[] vb = new int[10]; // 用于记录给定数字各数字出现的次数（0-9）

        // 检查四位数字
        for (int i = 0; i < 4; i++) {
            int ss = s % 10; // 获取当前数字的最后一位
            int tt = t % 10; // 获取给定数字的最后一位
            s /= 10; // 去除当前数字的最后一位
            t /= 10; // 去除给定数字的最后一位

            if (ss == tt)  // 如果位置和数字都正确
                a--;  // 减少a的计数
            else {
                va[ss]++;  // 记录当前数字的ss出现的次数
                vb[tt]++;  // 记录给定数字的tt出现的次数
            }
        }

        // 检查位置不正确但数字正确的情况
        for (int i = 0; i < 10; i++)
            b -= Math.min(va[i], vb[i]);  // 计算并减少b的计数

        // 返回判断结果，a和b都为0则表示符合提示
        return a == 0 && b == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<Integer> res=new ArrayList<>();
        List<int []> tmp=new ArrayList<>();
        for (int i=0;i<n;i++){
            String s=sc.nextLine();
            tmp.add(new int[]{Integer.parseInt(s.split(" ")[0]),Integer.parseInt(s.split(" ")[1].substring(0,1)),Integer.parseInt(s.split(" ")[1].substring(2,3))});

        }

        for (int j=0;j<10000;j++){
            boolean flag=true;
            for (int [] k:tmp){
                boolean guss = guss(j, k[0], k[1], k[2]);
                flag &=guss;
            }
            if (flag){
                res.add(j);
            }
            if (res.size()>1){
                break;
            }
        }
        if (res.size()!=1){

            System.out.println("NA");
        }else {
            System.out.println(res.get(0));
        }
    }
}

