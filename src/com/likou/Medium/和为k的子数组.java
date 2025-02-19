package com.likou.Medium;

public class 和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
    int count=0;
    for (int i=0;i<nums.length;i++){
        int sum=0;
        for (int j=i;j>=0;j--){
            sum+=nums[j];
            if (sum==k){
                count++;
            }
        }
    }
    return count;
    }
}
