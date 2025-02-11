package com.likou.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和_7_5 {

    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
    //首先对数组排序
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                while(j>i+1&&j<nums.length&&nums[j]==nums[j-1]) j++;
                if (j>=k) break;
                int res=nums[i]+nums[j]+nums[k];
                if (res==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                }else if (res<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }
}
