package com.likou.Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class 有效的括号_20_7 {
    public boolean isValid(String s) {
        Deque<Character> d=new ArrayDeque<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                d.addFirst(s.charAt(i));
            }else if(!d.isEmpty()&&(s.charAt(i)==')'&&'('==d.peek()||s.charAt(i)==']'&&'['==d.peek()||s.charAt(i)=='}'&&'{'==d.peek())){
                d.poll();
            }else {
                return false;
            }

        }
        if (d.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
