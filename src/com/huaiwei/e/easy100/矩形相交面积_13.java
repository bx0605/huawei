package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 矩形相交面积_13 {
    static class Rectangle{
        //x1,x2为坐上角横纵坐标，x2,y2为右下角坐标
        int x1;
        int y1;
        int x2;
        int y2;
        public Rectangle(int x1,int y1,int w,int z){
            this.x1=x1;
            this.y1=y1;
            this.x2=x1+w;
            this.y2=y1-z;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Rectangle r2 = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Rectangle r3 = new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        int max_x1=Math.max(r1.x1,r2.x1);
        int min_x2=Math.min(r1.x2,r2.x2);
        int min_y1=Math.min(r1.y1,r2.y1);
        int max_y2=Math.max(r1.y2,r2.y2);
        if (max_x1>min_x2||min_y1<max_y2){
            System.out.println(0);
            return;
        }
        int max_x11=Math.max(max_x1,r3.x1);
        int min_x22=Math.min(min_x2,r3.x2);
        int min_y11=Math.min(min_y1,r3.y1);
        int max_y22=Math.max(max_y2,r3.y2);

        if (max_x11<min_x22&&min_y11>max_y22){
            System.out.println((-max_x11+min_x22)*(min_y11-max_y22));
        }else {
            System.out.println(0);
        }

    }
}
