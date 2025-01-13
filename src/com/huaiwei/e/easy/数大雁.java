package com.huaiwei.e.easy;

import java.util.LinkedList;
import java.util.Scanner;

public class 数大雁 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSound=scanner.nextLine();
        System.out.println(getDuackNum(inputSound));
    }
    //定义一个获取大雁数量的方法
    public static int getDuackNum(String inputSound){
        int q=0,u=0,a=0,c=0,k=0;
        LinkedList<Integer> Q=new LinkedList<>();
        int cnt []=new int[inputSound.length()+1];
        int maxNum=0;
        //便利大雁叫声字符串
        for (int i=0;i<inputSound.length();i++){
            char input=inputSound.charAt(i);
            cnt[i+1]=cnt[i];
            if (input=='q'){
                //将当前字符q出现的位置加入到队列中
                Q.offer(i);
                q++;
            }else if (input=='u'&&u<q){
                u++;
            }else if(input=='a'&&a<u){
                a++;
            }else if (input=='c'&&c<a){
                c++;
            } else if (input == 'k'&&k<c) {
                k++;
                int first=Q.poll();
                cnt[i+1]++;
                maxNum=Math.max(maxNum,cnt[i+1]-cnt[first]);
            }else if (input !='q' ||input !='u' ||input !='a' ||input !='c' ||input !='k'){
                return -1;
            }
        }
        return maxNum==0?-1:maxNum;
    }
}
