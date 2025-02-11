package com.huaiwei.e.easy100;

import java.awt.*;
import java.util.*;

public class 构成正方形的数量_8 {


    /**
     * 计算由给定点集能够组成的正方形的数量
     *
     * @param points 二维数组，每个元素表示平面上的一个点，包含x和y坐标
     * @return 正方形的数量
     */
    public static int countSquares(int[][] points) {
        Map<String, Boolean> pointMap = new HashMap<>();
        //将横纵坐标合起来作为key
        for (int i = 0; i < points.length; i++) {
            pointMap.put(points[i][0] + "_" + points[i][1], true);
        }
        int count = 0;
        //for循环遍历所有左边，同时找出当前两个坐标对应的另外两个坐标
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                //第一组
                int x3 = x1 - (y1 - y2);
                int y3 = y1 + (x1 - x2);
                int x4 = x2 - (y1 - y2);
                int y4 = y2 + (x1 - x2);
                String key1 = x3 + "_" + y3;
                String key2 = x4 + "_" + y4;
                if (pointMap.containsKey(key1) && pointMap.containsKey(key2)) {
                    count++;
                }
                int x5 = x1 + (y1 - y2);
                int y5 = y1 - (x1 - x2);
                int x6 = x2 + (y1 - y2);
                int y6 = y2 - (x1 - x2);
                String key3 = x5 + "_" + y5;
                String key4 = x6 + "_" + y6;
                if (pointMap.containsKey(key3) && pointMap.containsKey(key4)) {
                    count++;
                }

            }

        }
        System.out.println(count);
        return count/4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        System.out.println(countSquares(points));
    }
}

