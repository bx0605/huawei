package com.huaiwei.e.easy;

import java.util.*;

public class 最大报酬 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // 读取总的可用工作时间 T 和任务数量 n
        int T = Scanner.nextInt();
        int n = Scanner.nextInt();

        // 初始化 DP 数组，长度为 T + 1，初始值为 0
        int[] dp = new int[T + 1];

        // 遍历每个任务，读取任务所需时间 t 和报酬 w
        for (int i = 0; i < n; i++) {
            int t = Scanner.nextInt();
            int w = Scanner.nextInt();

            // 从后向前更新 DP 数组
            for (int j = T; j >= t; j--) {
                dp[j] = Math.max(dp[j], dp[j - t] + w);
            }
        }

        // 输出在 T 时间内能获得的最大报酬
        System.out.println(dp[T]);

        Scanner.close();
    }
}

