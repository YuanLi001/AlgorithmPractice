package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/24 19:45
 */
public class t54 {
    int cn=0;
    Integer num=null;
    public int kthLargest(TreeNode root, int k) {
        check(root, k);
        return num;
    }

    public void check(TreeNode root, int k){
        if(root.right!=null){
            check(root.right,k);
        }
        if(num!=null){
            return;
        }
        cn++;
        if(cn==k){
            num=root.val;
            return;
        }
        if(root.left!=null){
            check(root.left,k);
        }
    }
}
