package com.huaiwei.e.easy;

import java.util.Scanner;

public class 增强的strstr {
    public static int enhancedStrStr(String haystack,String needle){

        int hLen=haystack.length();
        int nLen=needle.length();

        for(int i=0;i<hLen;i++){
            boolean match=true;
            int k=i;
            int j=0;
            while(k < hLen && j < nLen){
                boolean flag=false;
                //如果遇到[
                if(needle.charAt(j)=='['){
                    ++j;
                    while(needle.charAt(j)!=']'){
                        if (haystack.charAt(k)==needle.charAt(j)){
                            flag=true;
                        }
                        ++j;
                    }
                    if (!flag){
                        match=false;
                        break;
                    }
                    //跳过']'
                    ++j;
                }else {
                if (haystack.charAt(k)!=needle.charAt(j)){
                    match=false;
                    break;
                }
                ++j;
                }
                //移动到haystack的下一个字符
                ++k;
            }
            if (match){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        int i = enhancedStrStr(haystack, needle);
        System.out.println(i);

    }
}
