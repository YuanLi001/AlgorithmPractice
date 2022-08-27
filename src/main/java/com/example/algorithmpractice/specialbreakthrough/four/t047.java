package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/27 8:50
 */
public class t047 {
    public TreeNode pruneTree(TreeNode root) {
        TreeNode head=new TreeNode(1);
        head.left=null;
        head.right=root;
        allZero(head);
        if(head.right==null){
            return null;
        }else{
            return root;
        }
    }

    public boolean allZero(TreeNode node){
        if(node==null) return true;
        boolean left=allZero(node.left );
        if(left==true) node.left=null;
        boolean right=allZero(node.right);
        if(right==true) node.right=null;
        return left && right && node.val==0;
    }
}
