package com.likou.Medium;

import java.util.*;

public class 前k个高频元素 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
