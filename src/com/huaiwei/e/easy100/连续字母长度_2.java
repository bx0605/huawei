package com.huaiwei.e.easy100;

import java.util.*;

/**
 * 题目描述
 * 给定一个字符串，只包含大写字母，求在包含同一字母的子串中，长度第 k 长的子串的长度，相同字母只取最长的那个子串。
 * <p>
 * 输入描述
 * 第一行有一个子串(1<长度<=100)，只包含大写字母。
 * 第二行为 k的值
 * <p>
 * 输出描述
 * 输出连续出现次数第k多的字母的次数。
 * <p>
 * 补充说明
 * 若子串中只包含同一字母的子串数小于k，则输出-1
 * <p>
 * 用例
 * <p>
 * 用例1
 * 输入
 * AAAAHHHBBCDHHHH
 * 3
 * 输出
 * 2
 * 说明：同一字母连续出现的最多的是A和H，四次；第二多是H，三次，但H已经存在4个连续的，故不考虑；下个最长子串是BB，所以最终答案应该输出2。
 * <p>
 * 用例2
 * 输入
 * AABAAA
 * 2
 * 输出
 * 1
 * 说明：同一字母连续出现的最多的是A，三次；第二多还是A，两次，但A已经存在最大连续次数三次，故不考虑；下个最长子串是B，所以输出1
 * <p>
 * 用例3
 * 输入
 * ABC
 * 4
 * 输出
 * -1
 * 说明：只含有3个包含同一字母的子串，小于k，输出-1
 * <p>
 * 用例4
 * 输入
 * ABC
 * 2
 * 输出
 * 1
 * 说明：三个子串长度均为1，所以此时k=1，k=2，k=3，这三种情况均输出1，特此说明，避免歧义。
 */
public class 连续字母长度_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                map.put(s.charAt(i), Math.max(count, map.getOrDefault(s.charAt(i), 0)));
                count = 1;
            }
        }

        ArrayList<Integer> integers = new ArrayList<>(map.values());
        Collections.sort(integers, Collections.reverseOrder());
        if (n > integers.size() || n <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(integers.get(n -1));
        }
    }
}
