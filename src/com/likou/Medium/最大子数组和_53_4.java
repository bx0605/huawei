package com.likou.Medium;

public class 最大子数组和_53_4 {
    public int maxSubArray(int[] nums) {
        int f=0;
        int ans=Integer.MIN_VALUE;
        for (int n:nums){
            f=Math.max(0,f)+n;
            ans=Math.max(ans,f);
        }
        return ans;
    }
}
