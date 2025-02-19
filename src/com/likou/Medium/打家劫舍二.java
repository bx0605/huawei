package com.likou.Medium;

import java.util.Arrays;

public class 打家劫舍二 {
    public int rob(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length-1];
        int dp1[]=new int[nums.length-1];
        return Math.max(rang(Arrays.copyOfRange(nums,1,nums.length),dp),rang(Arrays.copyOfRange(nums,0,nums.length-1),dp1));
    }
    public static int rang(int [] nums,int [] dp){
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
           dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
