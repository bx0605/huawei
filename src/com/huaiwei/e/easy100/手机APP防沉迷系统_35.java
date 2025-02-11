package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 手机APP防沉迷系统_35 {
    static class App{
        String name;
        int priority;
        int startTime;
        int endTime;
        public App(String name, int priority, int startTime, int endTime) {
            this.name = name;
            this.priority = priority;
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public static int toMinute(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        return hour * 60 + minute;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<App> apps = new ArrayList<App>();
        for (int i = 0; i < n; i++) {
            List<App> temp = new ArrayList<App>();
            String str=sc.nextLine();
            String name=str.split(" ")[0];
            int priority=Integer.parseInt(str.split(" ")[1]);
            int startTime=toMinute(str.split(" ")[2]);
            int endTime=toMinute(str.split(" ")[3]);
            boolean flag=true;
            for (App app : apps) {
                if(app.startTime >= startTime && app.endTime <= endTime){
                    if(app.priority < priority){
                        flag=false;
                    }
                }
            }
            if(!flag){
                for(App app : apps){
                    if(!
                            (app.startTime >= startTime && app.endTime <= endTime)){
                        temp.add(app);
                    }
                }
               temp.add(new App(name, priority, startTime, endTime));
                apps=temp;
            }
        }
        int time=toMinute(sc.nextLine());
        for(App app : apps){
            if (time >= app.startTime && time <= app.endTime){
                System.out.println(app.name);
                return;
            }
        }
        System.out.println("NA");
    }
}
