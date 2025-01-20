package com.huaiwei.e.easy100;

import java.util.Scanner;

public class 计算三叉搜索树的高度_33 {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        TreeNode middle;
        int val;
        public TreeNode(int val){
            this.val = val;
        }
    }
 public static int high(TreeNode root,int low){
        TreeNode node = new TreeNode(low);
        int high = 1;
        while (true){
            if (root.val-500>=low){
                if (root.left==null){
                    root.left=node;
                    break;
                }else {
                    root=root.left;
                    high++;
                }
            }else if (root.val+500<=low){
                if (root.right==null){
                    root.right=node;
                    break;
                }else {
                    root=root.right;
                    high++;
                }
            }else {
                if (root.middle==null){
                    root.middle=node;
                    break;
                }else {
                    root=root.middle;
                    high++;
                }
            }
        }
        return high;
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        TreeNode root = new TreeNode(Integer.parseInt(sc.nextLine()));
        int h=1;
        for(int i=0;i<n-1;i++){
          h=  Math.max(high(root,Integer.parseInt(sc.nextLine())),h);
        }
        System.out.println(h+1);
    }
}
