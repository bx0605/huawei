package com.likou.Medium;

import java.util.Arrays;

public class 最大数_179_1 {
    public String largestNumber(int[] nums) {
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = "" + nums[i];
        }
        Arrays.sort(res, (x, y) -> {
            return (y + x).compareTo(x + y);
        });
        if (res[0].equals("0")) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : res) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
