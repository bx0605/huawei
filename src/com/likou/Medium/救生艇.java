package com.likou.Medium;

import java.util.Arrays;

public class 救生艇 {
    public int numRescueBoats(int[] people, int limit) {
        int left=0;
        int right=people.length-1;
        int res=0;
        Arrays.sort(people);
        while (left<right){
            if (people[left]+people[right]<=limit){
                res++;
                left++;
                right--;
            }else {
                right--;
                res++;
            }
        }
        if (left==right){
            return ++res;
        }else{
            return res;
        }
    }
}
