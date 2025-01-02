package com.huaiwei.e.easy;

import java.util.Scanner;

public class 找终点 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums=sc.nextLine().split(" ");
        int ans=Integer.MAX_VALUE;
        for (int i=1;i<nums.length/2;i++){
            int let=1;

            int res=i;
            if (res != nums.length-1){
                while(res<nums.length-1){
                    res=Integer.parseInt(nums[res])+res;
                    if (res> nums.length-1){
                         let=Integer.MAX_VALUE;
                        break;
                    }
                let++;
                }
            }
            ans=Math.min(let,ans);
        }
        if (ans==Integer.MAX_VALUE){
            ans=-1;
        }
        System.out.println(ans);
    }
}
