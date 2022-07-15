package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/3 14:42
 */
public class t2 {
    public boolean isValidBST(TreeNode root) {

        if(root.left==null && root.right==null){
            return true;
        }
        if (root.left!=null){
            if(root.val<= root.left.val){
                 return false;
            }
        }
        if (root.right!=null){
            if(root.val>=root.right.val){
                 return false;
            }
        }
        if(root.left!=null&&root.right!=null){
            return isValidBST(root.left) && isValidBST(root.right) ;
        }else if(root.left!=null){
            return isValidBST(root.left);
        }else{
            return isValidBST(root.right);
        }

    }
}
