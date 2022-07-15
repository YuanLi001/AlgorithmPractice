package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/27 10:00
 */
public class t68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true){
            if(p.val< root.val && q.val< root.val){
                root=root.left;
            }else if(p.val > root.val &&q.val> root.val){
                root=root.right;
            }else{
                break;
            }
        }
        return root;
    }
}
