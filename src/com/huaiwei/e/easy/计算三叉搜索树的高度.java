package com.huaiwei.e.easy;

import java.util.Scanner;

public class 计算三叉搜索树的高度 {
    static class TreeNode {
        int val;
        //左子树
        TreeNode left;
        //右子树
        TreeNode right;
        //中子树
        TreeNode center;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String nums=scanner.nextLine();
        int maxHigh=1;
        TreeNode treeNode = new TreeNode(Integer.parseInt(nums.split(" ")[0]));
        for (int i=1;i<n;i++){
            int high=calTreeHigh(treeNode,Integer.parseInt(nums.split(" ")[i]));
            maxHigh=Math.max(maxHigh,high);
        }
        System.out.println(maxHigh+1);
    }

    public static int calTreeHigh(TreeNode tree, int nums) {
        int high = 1;

        TreeNode treeNode = new TreeNode(nums);
        while (true) {
            int diff = nums - tree.val;
            if (Math.abs(diff) <= 500) {

                if (tree.center == null) {
                    //如果当前节点的中子树为空，则将新节点的中字数添加到该节点的中子树
                    tree.center = treeNode;
                    break;
                } else {
                    //如果当前节点的中子树部位空，则将当前节点指向该结点的中子树，下次循环进来的时候该节点中子树不为空，则树高+1
                    high++;
                    tree = tree.center;
                }
            } else if (diff < -500) {
            if (tree.left==null){
                tree.left=treeNode;
                break;
            }else {
                high++;
                tree=tree.left;
            }
            }else {
             if (tree.right==null){
                 tree.right=treeNode;
                 break;
             }else {
                 high++;
                 tree=tree.right;
             }
            }
        }
        return high;
    }
}
