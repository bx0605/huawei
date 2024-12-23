package com.huaiwei;

import java.util.Scanner;

public class 最大坐标值 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //指令总个数
        try {
            int all=sc.nextInt();
            sc.nextLine();
            if (all<1||all>100){
                throw new Exception();
            }
            //幸运数字
            int lucky=sc.nextInt();
            sc.nextLine();
            if (lucky<-100||lucky>100){
                throw new Exception();
            }
            //所有指令
            String code = sc.nextLine();
            int [] allCode=new int[all];
            int res=0;
            int tmp=0;
            for (int i=0;i<all;i++){
                allCode[i]=Integer.parseInt(code.split(" ")[i]);
                if (allCode[i]<-100||allCode[i]>100){
                    throw new Exception();
                }
                if(lucky>=0){
                    if (lucky==allCode[i]){
                        tmp=tmp+allCode[i]+1;
                    }else {
                        tmp=tmp+allCode[i];
                    }
                }else {
                    if (lucky==allCode[i]){
                        tmp=tmp+allCode[i]-1;
                    }else {
                        tmp=tmp+allCode[i];
                    }
                }
                res=Math.max(res,tmp);
            }
            System.out.println(res);

        }catch (Exception e){
            System.out.println(12345);
        }

    }
}
