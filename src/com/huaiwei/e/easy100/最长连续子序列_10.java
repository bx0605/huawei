package com.huaiwei.e.easy100;

import java.util.Scanner;

/**
 * 有N个正整数组成的一个序列。给定整数sum，求长度最长的连续子序列，使他们的和等于sum，返回此子序列的长度，如果没有满足要求的序列，返回-1。
 *
 * 输入描述
 * 序列:1,2,3,4,2 sum: 6
 * 输出描述
 * 序列长度:3
 *
 * 补充说明
 * 输入序列仅由数字和英文逗号构成，数字之间采用英文逗号分隔;
 * 序列长度:1<=N<=200;
 * 输入序列不考虑异常情况，由题目保证输入序列满足要求。
 *
 * 示例1
 * 输入
 * 1,2,3,4,2
 * 6
 * 输出
 * 3
 * 说明
 * 解释:1,2,3和4,2两个序列均能满足要求，所以最长的连续序列为1,2,3，因此结果为3
 */
public class 最长连续子序列_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String[] s=str.split(",");
        int res=-1;
        for (int i=0;i<s.length;i++){

            int tmp=0;
            for (int j=i;j<s.length;j++){
            int b=Integer.parseInt(s[j]);
            tmp+=b;
            if (tmp==n){
                res=Math.max(res,j-i+1);
            }
            }
        }
        System.out.println(res);
    }
}
