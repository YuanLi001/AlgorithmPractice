package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/26 23:08
 */
public class t55 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        int cn=0;
        while (!deque.isEmpty()){
            cn++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
        }
        return cn;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
