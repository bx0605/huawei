package com.huaiwei.e.hard;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class 空栈压数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line=scanner.nextLine().split(" ");
        Stack<Integer> stack=new Stack<>();
        for (String l:line){
            stack.push(Integer.valueOf(l));

            boolean flag=true;
            while (flag){
                flag=false;
                //获取栈顶元素
                int num=stack.peek();
                int n=stack.size();
                if (n>=2&& Objects.equals(stack.peek(), stack.get(n - 2))){
                    flag=true;
                    stack.pop();
                    stack.pop();
                    stack.push(2*num);
                }

                if (n>=3){
                    int tmp=0;
                    for (int i=n-2;i>=0;i--){
                        tmp+=stack.get(i);
                        if (tmp==num){
                        int j=i;
                        while (j<=n-1){
                            stack.pop();
                            j++;
                        }
                        stack.push(num*2);
                        flag=true;
                        break;
                        }
                    }

                }
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
