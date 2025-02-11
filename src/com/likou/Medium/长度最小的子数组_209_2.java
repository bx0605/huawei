package com.likou.Medium;

public class 长度最小的子数组_209_2 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;

        for (int i=0;i<nums.length;i++){
            int sum=0;
            for (int j=i;j< nums.length;j++){
                sum+=nums[j];
                if (sum>=target){
                    ans=Math.min(ans,j-i+1);
                    break;
                }
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
    public static void main(String[] args) {

    }
}
