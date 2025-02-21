package com.likou.Medium;

import java.util.HashSet;
import java.util.List;

public class 单词拆分_139_13 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] flag = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && set.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[s.length()];
    }
}
