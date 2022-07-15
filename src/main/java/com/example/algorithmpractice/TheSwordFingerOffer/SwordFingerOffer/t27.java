package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/16 20:18
 */
public class t27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return root;
        }
        recur(root);
        return root;
    }

    public void recur(TreeNode root){
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null){
            recur(root.left);
        }
        if(root.right!=null){
            recur(root.right);
        }
    }
}
