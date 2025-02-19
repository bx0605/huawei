package com.likou.Medium;

import java.util.Arrays;

public class 零钱兑换_322_15 {
    public int coinChange(int[] coins, int amount) {
        int max=amount+1;
        int [] dp=new int[max];
        Arrays.fill(dp,max);
        dp[0]=0;
        for (int i=1;i<max;i++){
            for (int j=0;j<coins.length;j++){
                if (coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]==max?-1:dp[amount];
    }
}
