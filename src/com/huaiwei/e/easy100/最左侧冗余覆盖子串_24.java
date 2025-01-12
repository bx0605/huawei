package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 最左侧冗余覆盖子串_24 {
    static int [] chr1=new int[26];
    static int [] chr2=new int[26];

    static boolean cmp(){
        for (int i=0;i<26;i++){
            if (chr1[i]>chr2[i]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int k = sc.nextInt();
        int s1Len=s1.length();
        if (s1Len+k>s2.length()){
            System.out.println(-1);
            return;
        }
        for (int i=0;i<s1Len;i++){
            chr1[s1.charAt(i)-'a']++;
        }

        for (int i=0;i<s1Len+k;i++){
            chr2[s2.charAt(i)-'a']++;
        }

        for (int j=s1Len;j<=s2.length();j++){
            if (cmp()){
                System.out.println(j-s1Len);
                return ;
            }
            if(j==s2.length()) break;
            chr2[s2.charAt(j-s1Len)-'a']--;
            chr2[s2.charAt(j)-'a']++;
        }
        System.out.println(-1);

    }
}
