package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/31 9:35
 */
public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor=null;
        if(p.right!=null){
            successor=p.right;
            while (successor.left!=null){
                successor=successor.left;
            }
            return successor;
        }
        TreeNode node=root;
        if(node.val>p.val){
            while (node.left!=null && node.left.val>p.val){
                node=node.left;
            }
            return node;
        }else {
//            node=node.right;
            while (node.right!=null && node.right.val < p.val){
                node=node.right;
            }
            if(node.right!=null && node.right.val > p.val){
                node=node.right;
                while (node.left!=null && node.left.val>p.val){
                    node=node.left;
                }
                return node;
            }else {
                return null;
            }

        }

    }
}
