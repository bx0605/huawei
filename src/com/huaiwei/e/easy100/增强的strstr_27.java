package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 增强的strstr_27 {
    //定义一个方法用来返回是否是模糊字串
    public static int matchStr(String ori,String needle){
        int a=ori.length();
        int b=needle.length();
        for (int i=0;i<a;i++){
        int j=0;
        int k=i;
        boolean flag=true;
        while (j<b&&k<a){
            if (needle.charAt(j)=='['){
                boolean m=false;
                j++;
                while (needle.charAt(j)!=']'){
                    if (needle.charAt(j)==ori.charAt(k)){
                        m=true;
                    }
                    j++;
                }
                if (!m){
                    flag=false;
                    break;
                }
                j++;
            }else {
                if (needle.charAt(j)!=ori.charAt(k)){
                    flag=false;
                    break;
                }
                j++;
            }
            k++;
        }
        if (flag){
            return i;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();
        int i = matchStr(haystack, needle);
        System.out.println(i);

    }
}
