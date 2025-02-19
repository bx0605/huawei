package com.huaiwei.e.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 推荐多样性 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int windowSize = Integer.parseInt(input.nextLine());
        int content = Integer.parseInt(input.nextLine());
        String[][] matrix = new String[windowSize][content];
        List<List<String>> list = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] split = line.split(" ");
            List<String> list1 = Arrays.asList(split);
            list.add(list1);
        }
        int[] index = new int[list.size()];
        int count = 0;
        for (int i = 0; i < content; i++) {
            int old = count;
            for (int j = 0; j < windowSize; j++) {
                while (index[count] >= list.get(count).size()) {
                    count++;
                    count = count % list.size();
                }
                matrix[j][i] = list.get(count).get(index[count]);
                index[count]++;
            }
            if (count == old) {
                // 移动到下一行
                count++;
                count = count % list.size();
                while (index[count] >= list.get(count).size()) {
                    count++;
                    count = count % list.size();
                }
            }
        }

        for (int i = 0; i < windowSize; i++) {
            for (int j = 0; j < content; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }


}

