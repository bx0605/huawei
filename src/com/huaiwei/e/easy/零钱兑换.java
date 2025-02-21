package com.huaiwei.e.easy;

import java.util.Arrays;

public class 零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        int [] res=new int[amount+1];
        int max=amount+1;
        Arrays.fill(res,max);
        res[0]=0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++){
                if (i>=coins[j]){
                    res[i]=Math.min(res[i],res[i-coins[j]]+1);
                }
            }
        }
        return res[amount]==max?-1:res[amount];
    }
}
