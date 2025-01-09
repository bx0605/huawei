package com.huaiwei.e.easy100;

import java.util.*;

/**
 * 在斗地主扑克牌游戏中，扑克牌由小到大的顺序为:
 * 3,4,5,6,7,8,9,10,J,Q,K,A,2，玩家可以出的扑克牌阵型有:单张、对子、顺子、飞机、炸弹等。
 * 其中顺子的出牌规则为:由至少5张由小到大连续递增的扑克牌组成，且不能包含2。
 * 例如:{3,4,5,6,7}、{3,4,5,6,7,8,9,10,J,Q,K,A}都是有效的顺子;而{J,Q,K,A,2}、{2,3,4,5,6}、{3,4,5,6}、{3,4,5,6,8}等都不是顺子。
 * 给定一个包含13张牌的数组，如果有满足出牌规则的顺子，请输出顺子。
 * 如果存在多个顺子，请每行输出一个顺子，且需要按顺子的第一张牌的大小(必须从小到大)依次输出。
 * 如果没有满足出牌规则的顺子，请输出No。
 * <p>
 * 输入描述
 * 13张任意顺序的扑克牌，每张扑克牌数字用空格隔开，每张扑克牌的数字都是合法的，并且不包括大小王:2 9 J 2 3 4 K A 7 9 A 5 6
 * 不需要考虑输入为异常字符的情况
 * <p>
 * <p>
 * 输出描述
 * 组成的顺子，每张扑克牌数字用空格隔开:
 * <p>
 * 3 4 5 6 7
 * <p>
 * <p>
 * 示例1
 * 输入
 * 2 9 J 2 3 4 K A 7 9 A 5 6
 * 输出
 * 3 4 5 6 7
 * 说明
 * 13张牌中，可以组成的顺子只有1组:3 4 5 6 7
 */
public class 斗地主之顺子_6 {
    //定义一个方法，将牌中的J、Q、K、A转化为数字
    public static List<Integer> transform(String pk) {
        HashSet<Integer> set = new HashSet<>();
        String[] str = pk.split(" ");
        for (int i = 0; i < str.length; i++) {
            if ("2".equals(str[i])) {continue;}
            switch (str[i]) {
                case "J":
                    set.add(11);
                    break;
                case "Q":
                    set.add(12);
                    break;
                case "K":
                    set.add(13);
                    break;
                case "A":
                    set.add(14);
                    break;
                default:
                    set.add(Integer.parseInt(str[i]));
                    break;
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Integer> list = transform(s);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(list.get(i));
            for (int j = i + 1; j < list.size(); j++) {
                //使用过的牌不再使用
                i=j-1;
                if (list.get(j) == list.get(j - 1) + 1) {
                    temp.add(list.get(j));
                } else {

                    break;
                }
            }
            if (temp.size() >= 5) {
                res.add(temp);
            }
        }
        if (res.isEmpty()){
            System.out.println("No");
        }else {
            for (List<Integer> temp : res) {
                for (Integer integer : temp) {
                    switch(integer){
                        case 11: System.out.print("J ");break;
                        case 12: System.out.print("Q ");break;
                        case 13: System.out.print("K ");break;
                        case 14: System.out.print("A ");break;
                        default:
                            System.out.print(integer+" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
