package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/24 9:49
 */
public class t36_ {
    Node pre, head;
    public Node treeToDoublyList(Node root){
        if(root==null){
            return null;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur){

    }
}
