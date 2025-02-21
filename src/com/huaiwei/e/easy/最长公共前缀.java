package com.huaiwei.e.easy;

import java.util.Arrays;

public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < strs.length; i++) {
            if (i == 1) {
                int tmp = Math.min(strs[1].length(), strs[0].length());
                int t = 0;
                while (t < tmp && strs[0].charAt(t) == strs[1].charAt(t)) {
                    str.append(strs[0].charAt(t));
                    t++;
                }
            }else{
                StringBuilder str1 = new StringBuilder();
                String ss=str.toString();
                int l=Math.min(ss.length(),strs[i].length());
                int ll=0;
                while(l>ll&&ss.charAt(ll)==strs[i].charAt(ll)){
                    str1.append(ss.charAt(ll));
                    ll++;
                }
                str=str1;
            }
        }
        return str.toString();
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        StringBuilder str=new StringBuilder();
        int i=0;
        int j=strs.length-1;
        while(i<strs[0].length()&&i<strs[j].length()&&strs[0].charAt(i)==strs[j].charAt(i)){
            str.append(strs[0].charAt(i));
            i++;

        }
        return str.toString();
    }
}
