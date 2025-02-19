package com.likou.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 全排列 {
public static void generator(List<Integer> o,int i,List<List<Integer>> res){
    if (i==o.size()-1){
        res.add(new ArrayList<>(o));
        return;
    }
    for (int j=i;j<o.size();j++){
        Collections.swap(o,i,j);
        generator(o,i+1,res);
        Collections.swap(o,i,j);
    }
}
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> o=new ArrayList<>();
        for (int l:nums){
            o.add(l);
        }
        List<List<Integer>> res=new ArrayList<>();
        generator(o,0,res);
        return res;
    }
}
