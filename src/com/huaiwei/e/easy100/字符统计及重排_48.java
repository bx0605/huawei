package com.huaiwei.e.easy100;

import java.util.*;

public class 字符统计及重排_48 {
    static class Obj implements Comparable<Obj>{
        char a;
        int b;
public Obj(char a,int b){
    this.a=a;
    this.b=b;
}


        @Override
        public int compareTo(Obj o) {
            return this.b==o.b?this.a-o.a:this.b-o.b;
        }
    }

    public static void main(String[] args) {
        List<Obj> list=new ArrayList<>();
        List<Obj> list1=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        for (Character c:sc.nextLine().toCharArray()){
            if (c>'a'&&c<'z') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }else {
                if (map1.containsKey(c)) {
                    map1.put(c, map1.get(c) + 1);
                } else {
                    map1.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character,Integer> m:map.entrySet()){
            list.add(new Obj(m.getKey(),m.getValue()));
        }
        for (Map.Entry<Character,Integer> m:map1.entrySet()){
            list1.add(new Obj(m.getKey(),m.getValue()));
        }
        Collections.sort(list);
        Collections.sort(list1);
        for (Obj l:list){
            System.out.print(l.a+":"+l.b+";");
        }
        for (Obj l:list1){
            System.out.print(l.a+":"+l.b+";");
        }
    }
}
