package com.huaiwei;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class API集群负载统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums=Integer.parseInt(sc.nextLine());
        String [] lines=new String[nums];
        for (int i=0;i<nums;i++){
            lines[i]=sc.nextLine();
        }
        String search=sc.nextLine();
        int level=Integer.parseInt(search.split(" ")[0]);
        String world=search.split(" ")[1];
        Count(lines,level,world);
    }
    public static void Count(String[] lines,int level,String world){
        int count=0;
        for (int i =0;i<lines.length;i++){
            if(lines[i].split("/").length>level&&lines[i].split("/")[level].equals(world)){
                count++;
            }
        }
        System.out.println(count);
    }
}
