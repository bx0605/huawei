package com.likou.Medium;

import java.util.HashMap;
import java.util.Map;

public class 同构字符串 {
    public boolean isIsomorphic(String s, String t) {
        return isTmp( s,  t)&&isTmp(t, s);
    }
    public static boolean isTmp(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else {
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
