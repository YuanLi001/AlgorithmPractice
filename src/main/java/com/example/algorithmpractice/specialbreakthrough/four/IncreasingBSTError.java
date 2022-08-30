package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/30 10:26
 */
public class IncreasingBSTError {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head=new TreeNode();
        TreeNode oldHead=head;
        middle(root,head);
        return oldHead.right;
    }
    public void middle(TreeNode node,TreeNode head){
        if(node==null){
            return;
        }
        middle(node.left,head);
        head.right=node;
        node.left=null;
        head=node;
        middle(node.right,head);
    }
}
