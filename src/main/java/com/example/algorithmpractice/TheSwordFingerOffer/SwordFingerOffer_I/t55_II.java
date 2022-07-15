package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/26 23:38
 */
public class t55_II {
//    public boolean isBalancedCheck(TreeNode root) {
//        if(root==null){
//            return true;
//        }
//        Deque<TreeNode> deque=new LinkedList<>();
//        deque.add(root);
//        int cn=0,min=0;
//        while (!deque.isEmpty()){
//            cn++;
//            int size = deque.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = deque.pop();
//                if(  min==0 && (node.left==null || node.right==null) ){
//                    min=cn;
//                }
//                if(node.left!=null){
//                    deque.add(node.left);
//                }
//                if(node.right!=null){
//                    deque.add(node.right);
//                }
//            }
//        }
//        if(cn-min>1){
//            return false;
//        }else{
//            return true;
//        }
//    }

    public boolean isBalancedCheck(TreeNode root) {
//        if(root==null){
//            return true;
//        }
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        int cn=0,min=0;
        while (!deque.isEmpty()){
            cn++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pop();
                if(  min==0 && (node.left==null || node.right==null) ){
                    min=cn;
                }
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
        }
        if(cn-min>1){
            return false;
        }else{
            return true;
        }
    }

    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()){
            TreeNode remove = list.remove();
            boolean balancedCheck = isBalancedCheck(remove);
            if(!balancedCheck){
                return false;
            }
            if(root.left!=null){
                list.add(root.left);
            }
            if(root.right!=null){
                list.add(root.right);
            }
        }
        return true;
    }
}

