package com.likou.Medium;

import java.util.HashSet;

public class 无重复的最长子串_6 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int r=0;

        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while( r<s.length()&&!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            ans=Math.max(ans,r-i);
        }
        return ans;
    }
}
