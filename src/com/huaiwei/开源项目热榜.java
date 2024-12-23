package com.huaiwei;

import java.io.InputStream;
import java.util.*;
public class 开源项目热榜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //开源项目个数
        int n=sc.nextInt();
        int [] weights=new int[5];
        //输入权重
       String wei= sc.next();
        for(int i=0;i<5;i++){
            weights[i]=Integer.parseInt(wei.split(",")[i]);
        }
        //输入各个开源项目名称以及其在各个权重维度中的分值
        List<Map<String,Object>> projects=new ArrayList<>();
        for (int i=0;i<n;i++){
            String project=sc.next();
            String name=project.split(",")[0];
            int [] hotValues=new int[5];
            hotValues[0]=Integer.parseInt(project.split(",")[1]);
            hotValues[1]=Integer.parseInt(project.split(",")[2]);
            hotValues[2]=Integer.parseInt(project.split(",")[3]);
            hotValues[3]=Integer.parseInt(project.split(",")[4]);
            hotValues[4]=Integer.parseInt(project.split(",")[5]);
            int hottedValue = HotValue(weights, hotValues);
            Map<String,Object> map=new HashMap<>();
            map.put("name",name);
            map.put("hostValue",hottedValue);
            projects.add(map);
        }
        Collections.sort(projects,(p1,p2)->{
            if ((int)p1.get("hostValue")==((int)p2.get("hostValue"))){
                return ((String)p2.get("name")).toLowerCase().compareTo(((String)p1.get("name")).toLowerCase());
            }else {
                return Integer.compare((int)p1.get("hostValue"),(int)p2.get("hostValue"));
            }
        });
        for(Map<String,Object> map:projects){
            System.out.println(map.get("name"));
        }
    }
    public static int HotValue(int [] weights,int [] pro){
        int res=0;
        for(int i=0;i<weights.length;i++){
            res=res+weights[i]*pro[i];
        }
        return res;
    }
}