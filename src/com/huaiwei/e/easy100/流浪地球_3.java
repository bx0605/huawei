package com.huaiwei.e.easy100;


import java.util.*;

public class 流浪地球_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //总发动机数
        String []str=scanner.nextLine().split(" ");
        int nums = Integer.parseInt(str[0]);
        //手动启动发动机数
        int n = Integer.parseInt(str[1]);

        //标记当前编号的发动机是否启动
        boolean[] flag = new boolean[nums];
        //初始化每个发动机启动时间
        Integer[] activeTime = new Integer[nums];
        Arrays.fill(activeTime, -1);
        //定义一个队列，保存发动机编号以及启动时间
        Queue<Integer[]> pg = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));

        for (int i = 0; i < n; i++) {
            String ss = scanner.nextLine();
            //发动机启动时间
            int T = Integer.parseInt(ss.split(" ")[0]);
            int P1 = Integer.parseInt(ss.split(" ")[1]);
            int P = P1-1;
            //发动机启动编号

            if (activeTime[P] == -1) {
                pg.offer(new Integer[]{P, T});
                activeTime[P]=T;
            }
        }
        while (!pg.isEmpty()) {
            Integer[] poll = pg.poll();
            int p = poll[0];
            int t = poll[1];

            if (flag[p]) continue;
            flag[p] = true;
            int[] neighbors = new int[]{(p - 1 + nums) % nums, (p + 1)%nums};
            for (int ne : neighbors) {
                int nextTime = t + 1;
                if (activeTime[ne] == -1 || activeTime[ne] > nextTime) {
                    if (!flag[ne]) {
                        pg.offer(new Integer[]{ne, nextTime});
                    }

                }

            }
        }
        List<Integer> list = Arrays.asList(activeTime);
        Integer max = Collections.max(list);
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i=0;i<activeTime.length;i++){
            if (activeTime[i]==max){
                objects.add(i);
            }
        }
        System.out.println(objects.size());

        for (int i:objects){
            System.out.print(i+" ");
        }
    }
}
