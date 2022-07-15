package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/3 15:39
 */
public class t2_guanfang {
//    public boolean isValidBST(TreeNode root) {
//        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    public boolean isValidBST(TreeNode node, long lower, long upper) {
//        if (node == null) {
//            return true;
//        }
//        if (node.val <= lower || node.val >= upper) {
//            return false;
//        }
//        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
//    }

    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        int a=5;
        System.out.println(-a);
    }


}
