package com.huaiwei.e.easy100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 单词接龙的规则是：
 *
 * 可用于接龙的单词首字母必须要前一个单词的尾字母相同；
 * 当存在多个首字母相同的单词时，取长度最长的单词，如果长度也相等，则取字典序最小的单词；已经参与接龙的单词不能重复使用。
 * 现给定一组全部由小写字母组成单词数组，并指定其中的一个单词作为起始单词，进行单词接龙，
 * 请输出最长的单词串，单词串是单词拼接而成，中间没有空格。
 *
 * 输入描述
 *
 * 输入的第一行为一个非负整数，表示起始单词在数组中的索引K，0 <= K < N ；
 * 输入的第二行为一个非负整数，表示单词的个数N；
 * 接下来的N行，分别表示单词数组中的单词。
 * 输出描述
 *
 * 输出一个字符串，表示最终拼接的单词串。
 * 补充说明
 *
 * 单词个数N的取值范围为[1, 20]；
 * 单个单词的长度的取值范围为[1, 30]；
 * 用例1
 *
 * 输入
 *
 * 0
 *
 * 6
 *
 * word
 *
 * dd
 *
 * da
 *
 * dc
 *
 * dword
 *
 * d
 *
 * 输出
 *
 * worddwordda
 *
 * 说明：先确定起始单词word，再接以d开头的且长度最长的单词dword，剩余以d开头且长度最长的有dd，da，dc，则取字典序最小的da，所以最后输出worddwordda。
 *
 * 用例2
 *
 * 输入
 *
 * 4
 *
 * 6
 *
 * word
 *
 * dd
 *
 * da
 *
 * dc
 *
 * dword
 *
 * d
 *
 * 输出
 *
 * dwordda
 *
 * 说明：先确定起始单词word，剩余以d开头且长度最长的有dd，da，dc，则取字典序最小的da,所以最后输出dwordda。
 */
public class 单词接龙_1 {
    //定义一个递归方法，入参为当前接龙单词、所有单词集合、所有单词是否使用过标记

    public static String wordChain(String currWord, List<String> wordList,boolean[] used) {
        //初始化下一个要接龙的单词，默认为空
        String nextWord = "";
        //定义一个标识，表示本次循环中找到的单词下标
        int  found = -1;
        for (int i = 0; i < wordList.size(); i++) {
            //如果当前接龙字符串尾字符与字符串集合中的某个单词的首字符相等，
            String word = wordList.get(i);
            if (currWord.charAt(currWord.length()-1)==word.charAt(0)&&!used[i]) {
                if (found==-1||
                        nextWord.length()<word.length()||
                        (nextWord.length()==word.length()&&nextWord.compareTo(word)>0)
                ) {
                    found=i;
                    used[i]=true;
                    nextWord=word;
                }

            }

        }


        //如果匹配上，则继续匹配
        if (found!=-1){
            used[found]=true;
            return currWord+wordChain(nextWord,wordList,used);
        }else {
            //如果没有匹配上，则返回当前字符串
            return currWord;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordIndex = scanner.nextInt();
        int wordNums = scanner.nextInt();
       scanner.nextLine();
        List<String> wordList = new ArrayList<String>();
        for (int i = 0; i < wordNums; i++) {
            wordList.add(scanner.nextLine());
        }
        boolean[] used = new boolean[wordNums];
        used[wordIndex]=true;
        System.out.println(wordChain(wordList.get(wordIndex), wordList, used));
    }
}
