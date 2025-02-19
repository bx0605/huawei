package com.likou.Medium;

import java.util.Arrays;

public class k次取反后的最大数组和 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for (int i=0;i<k;i++){
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }
        int res=0;
        for (int j:nums){
            res+=j;
        }
        return res;
    }
}
