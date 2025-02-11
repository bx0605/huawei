package com.huaiwei.e.easy100;

import java.util.*;

public class 寻找链表的中间结点_58 {
    static class ListNode{
        String data;
        String next;
        ListNode(String data, String next){
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String head=str.split(" ")[0];
        int n=Integer.parseInt(str.split(" ")[1]);
        Map<String,ListNode> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String a=sc.next();
            String b=sc.next();
            String c=sc.next();
            map.put(a,new ListNode(b,c));
        }
        String currNode=head;
        List<String> list=new ArrayList<>();
        while(!currNode.equals("-1")){
            list.add(currNode);
            currNode=map.get(currNode).next;
        }
        int mid=list.size()/2;
        System.out.println(map.get(list.get(mid)).data);
    }
}
