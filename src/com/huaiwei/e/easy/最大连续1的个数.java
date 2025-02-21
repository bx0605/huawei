package com.huaiwei.e.easy;

public class 最大连续1的个数 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tmp = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                tmp = 0;
            } else {
                tmp++;
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}
