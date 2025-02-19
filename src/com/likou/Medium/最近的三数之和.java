package com.likou.Medium;

import java.util.Arrays;

public class 最近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int k = nums.length - 1;
            for (int j = i + 1; j < k; ) {
                int tmp = nums[i] + nums[j] + nums[k];
                int abs = 0;
                if (tmp > target) {
                    k--;
                    abs = Math.abs(tmp - target);
                } else if (tmp < target) {
                    j++;
                    abs = Math.abs(-tmp + target);
                } else {
                    return tmp;
                }
                if (abs < res) {
                    res = abs;
                    r = tmp;
                }
            }
        }
        return r;
    }
}
