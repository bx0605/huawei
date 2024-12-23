package com.huaiwei;

import java.util.HashSet;
import java.util.Scanner;

public class 围棋的气 {
    static int maxSide=18;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locWhite=sc.nextLine();
        String locBlack=sc.nextLine();
        String[] locWhites=transform(locWhite);
        String[] locBlacks=transform(locBlack);
        System.out.println(counting(locWhites,locBlacks)+" "+counting(locBlacks,locWhites));
    }

     static String[] transform(String locs){
        String[] tmp=locs.split(" ");
        String[] res=new String[tmp.length/2];
        for (int i=0;i<tmp.length;i+=2){
        res[i/2]=tmp[i]+"_"+tmp[i+1];
        }
        return res;
     }
     static int counting(String[] alias,String[] ememy){
         HashSet<String> count = new HashSet<>();

         for (String str:alias){
              count.add(str);
            int left= Integer.parseInt(str.split("_")[0]);
             int right=  Integer.parseInt(str.split("_")[1]);
             if (left>0){
                 count.add((left-1)+"_"+right);
             }
             if (left<maxSide){
                 count.add((left+1)+"_"+right);
             }
             if (right>0){
                 count.add(left+"_"+(right-1));
             }
             if (left<maxSide){
                 count.add(left+"_"+(right+1));
             }
         }
         int res=count.size()-alias.length;
         for (String emem:ememy){
             if (count.contains(emem)){
            res--;
             }
         }
         return res;
     }
}
