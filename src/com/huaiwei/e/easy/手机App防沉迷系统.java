package com.huaiwei.e.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 手机App防沉迷系统 {
    //定义静态内部类
    static class App {
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



    //定义将HH:MM转换为分钟的方法
    public static int toMinutes(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        return hour * 60 + minute;

    }

    public static void main(String[] args) {
        //读取要注册的APP数量
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        //用来保存注册成功的App
        List<App> apps = new ArrayList<App>();

        for (int i = 0; i < n; i++) {
            List<App> result = new ArrayList<App>();
            String line = scanner.nextLine();
            String[] str = line.split(" ");
            String name = str[0];
            int priority = Integer.parseInt(str[1]);
            int startTime = toMinutes(str[2]);
            int endTime = toMinutes(str[3]);

            boolean flag = true;

            for (App app : apps) {
                if (startTime <= app.endTime && endTime >= app.startTime) {
                    if (app.priority > priority) {
                        flag = false;
                    }

                }
            }
            if (flag) {
                for (App app : apps) {
                if (!(startTime <= app.endTime && endTime >= app.startTime)){
                    result.add(app);
                }
                }
                result.add(new App(name, priority, startTime, endTime));
                apps=result;
            }
        }
        int minutes = toMinutes(scanner.nextLine());
        for (App app:apps){
            if (app.endTime>=minutes&&minutes>=app.startTime){
                System.out.println(app.name);
                return;
            }

        }
        System.out.printf("NA");
    }
}
