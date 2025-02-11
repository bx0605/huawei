package com.likou.Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class 小行星碰撞_735_3 {
        public  static int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> d = new ArrayDeque<>();
            for (int as : asteroids) {
                boolean ok = true;
                while (ok && !d.isEmpty() && d.peekLast() > 0 && as < 0) {
                    int a = d.peekLast();
                    int b = -as;
                    if (a >= b) {
                        ok = false;
                    }
                    if (a <= b){
                        d.pollLast();
                    }
                }
                if (ok) {
                    d.addLast(as);
                }
            }
            int n = d.size();
            int[] res = new int[n];
            while (!d.isEmpty()) res[--n] = d.pollLast();
            return res;
        }

    public static void main(String[] args) {
       for (int a:asteroidCollision(new int[]{5,10,-5})){
           System.out.print(a+",");
       }
    }
}
