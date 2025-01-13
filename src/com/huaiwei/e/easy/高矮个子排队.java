package com.huaiwei.e.easy;
import java.util.Scanner;
import java.util.Arrays;
public class 高矮个子排队 {
    /**
     * 我们现在希望小朋友排队，以“高“矮”“高”“矮"顺序排列，每一个“高”位置的小朋友要比相邻的位置高或者相等;每一个"矮”位置的小朋友要比相邻的位置矮或者相等;要求小朋友们移动的距离和最小，第一个从“高”位开始排，输出最小移动距离即可。例如，在示范小队{5,3,1,2,3}中，(5,1,3,2,3}是排序结果{5,2,3,1,3} 虽然也满足“高”“矮”“"高”“矮”顺序排列，但小朋友们的移动距离大，所以不是最优结果。移动距离的定义如下所示:第二位小朋友移到第三位小朋友后面，移动距离为1，若移动到第四位小朋友后面，移动距离为
     * @param args
     */
    public static void main(String[] args) {
        //输入班级小朋友身高集合
        Scanner scanner = new Scanner(System.in);
        String high = scanner.nextLine();
        String[] s = high.split(" ");
        int [] ints=new int[s.length];
        for (int i=0;i<s.length;i++){
            ints[i]=Integer.parseInt(s[i]);
        }
        boolean flag=true;
            for (int i=0;i<s.length-1;i++,flag=!flag){
                if(ints[i]==ints[i+1]||(ints[i]>ints[i+1]==flag)) continue;
                    int t=ints[i];
                    ints[i]=ints[i+1];
                    ints[i+1]=t;
            }
        for (int i=0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }
    }
}
