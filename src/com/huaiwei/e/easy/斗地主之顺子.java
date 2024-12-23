package com.huaiwei.e.easy;

import com.huaiwei.分割均衡字符串;

import java.util.*;

public class 斗地主之顺子 {
    public static void main(String[] args) {
        /**
         * 思路：
         * 1、扑克牌去掉2，3到A依次转为整数
         * 2、去重
         * 3、双指针循环得到顺子
         */
        String line = new Scanner(System.in).nextLine();
        String[] pk = line.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("J", 11);
                put("Q", 12);
                put("K", 13);
                put("A", 14);
            }
        };

        HashSet<Integer> hashSet = new HashSet<>();
        for (String p : pk) {
            if (p.equals("2")) {
                continue;
            } else if (map.containsKey(p)) {
                hashSet.add(map.get(p));
            } else {
                hashSet.add(Integer.parseInt(p));
            }
        }
        ArrayList<Integer> array = new ArrayList<>(hashSet);
        Collections.sort(array);

        List<List<Integer>> res = new ArrayList<>();

        int i = 0;
        while (i < array.size()-4) {
            int j = i + 1;
            List<Integer> list = new ArrayList<>();
            list.add(array.get(i));
            while (j < array.size()) {
                if (array.get(j) - array.get(j-1) == 1) {
                    list.add(array.get(j));
                    if (list.size()>=5&&j== array.size()-1){
                        res.add(list);
                    }
                } else {
                    if (list.size() >= 5) {
                        res.add(list);
                        i = j;
                    }
                    break;
                }
                j++;
            }
            i = j;
        }
        if (res.size() == 0) {
            System.out.println("NO");
        } else {
            for (List<Integer> r : res) {
                for (int j = 0; j < r.size(); j++) {
                    if (j == r.size() - 1) {
                        System.out.println(printPk(r.get(j)));

                    } else {
                        System.out.print(printPk(r.get(j)) + " ");
                    }
                }
            }
        }
    }
    public static String printPk(Integer t){
        if (t.equals(11)){
            return "J";
        }else if (t.equals(12)){
            return "Q";
        }else if (t.equals(13)){
            return "K";
        }else if (t.equals(14)){
            return "A";
        }else {
            return String.valueOf(t);
        }
    }
}
