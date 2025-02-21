package com.likou.Medium;

import java.util.*;

public class 字母异位词分组_33_字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char [] cha=str.toCharArray();
            Arrays.sort(cha);
            String s=new String(cha);
            if (map.containsKey(s)){
                map.get(s).add(str);
            }else{
                map.put(s,new ArrayList(Arrays.asList(str)));
            }
        }
        lists.addAll(map.values());
        return lists;
    }
}
