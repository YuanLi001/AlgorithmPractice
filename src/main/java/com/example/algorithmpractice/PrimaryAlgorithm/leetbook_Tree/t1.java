package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/3 14:25
 */
public class t1 {
    public int maxDepth(TreeNode root) {
        //DFS
        if(root==null){
            return 0;
        }
        return 1+Math.max( maxDepth(root.left),maxDepth(root.right)  );
        //BFS
//        if(root==null){
//            return 0;
//        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
