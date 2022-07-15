package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/4 8:40
 */
public class t3 {
    public boolean isSymmetric(TreeNode root) {
        return diGui(root.left,root.right);
    }

    public boolean diGui(TreeNode nodeLeft,TreeNode nodeRight){
        //当两者都为null时返回true
        if(nodeLeft==nodeRight){
            return true;
        }
        if(nodeLeft==null&&nodeRight!=null || nodeLeft!=null&&nodeRight==null){
            return false;
        }
        if(nodeLeft.val!=nodeRight.val){
            return false;
        }
        return diGui(nodeLeft.left,nodeRight.right) && diGui(nodeLeft.right,nodeRight.left);
    }
}
