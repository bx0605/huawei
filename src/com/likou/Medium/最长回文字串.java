package com.likou.Medium;

public class 最长回文字串 {
    public String longestPalindrome(String s) {
        String res=s.charAt(0)+"";
        for (int i=0;i<s.length()-1;i++){
            for (int j=s.length()-1;j>i;j--){
                int l=i;
                int m=j;

                    while(l<m&&s.charAt(l)==s.charAt(m)){
                        l++;
                        m--;
                    }
                if (l>=m&&res.length()<=j-i){
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
