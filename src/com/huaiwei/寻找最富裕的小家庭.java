package com.huaiwei;

import java.util.*;

public class 寻找最富裕的小家庭 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums=scanner.nextInt();
        scanner.nextLine();
        String familyMoney=scanner.nextLine();
        Map<Integer, List<Integer>> familys=new HashMap<>();
        for (int i=0;i<nums-1;i++){
            String line=scanner.nextLine();
            Integer key=Integer.parseInt(line.split(" ")[0]);
            Integer value=Integer.parseInt(line.split(" ")[1]);
            if (familys.containsKey(key)){
                List list=familys.get(key);
                list.add(value);
                familys.put(key,list);
            }else {
                List<Integer> l=new ArrayList<Integer>();
                l.add(value);
                familys.put(key,l);
            }
        }
        int maxmoney=0;
        for(Map.Entry<Integer,List<Integer>> entry:familys.entrySet()){
            int all=Integer.parseInt(familyMoney.split(" ")[entry.getKey()-1]);

            for (Integer tmp:entry.getValue()){
                all=all+Integer.parseInt(familyMoney.split(" ")[tmp-1]);
            }
            maxmoney=Math.max(maxmoney,all);
        }
        System.out.println(maxmoney);
    }
}
