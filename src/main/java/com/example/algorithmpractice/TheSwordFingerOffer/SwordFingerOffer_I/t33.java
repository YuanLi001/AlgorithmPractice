package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/2 9:05
 */
public class t33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int p = i;
        while(postorder[p] < postorder[j]) p++;
        int m = p;
        while(postorder[p] > postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
