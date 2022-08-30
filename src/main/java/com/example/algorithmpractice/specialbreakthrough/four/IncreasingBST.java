package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/30 9:23
 */
public class IncreasingBST {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head=new TreeNode();
        TreeNode oldHead=head;
        middle(root,head);
        root=oldHead.right;
        System.out.println("------");
        while (root!=null){
            System.out.println(root.val);
            root=root.right;
        }
        TreeNode ce=oldHead.right;
        System.out.println("------");
        while (ce!=null){
            System.out.println(ce.val);
            ce=ce.right;
        }
        return oldHead.right;
    }

    public void middle(TreeNode node,TreeNode head){
        if(node==null){
            return;
        }
        middle(node.left,head);
        System.out.println(node.val);
        head.right=node;
        head=node;
        middle(node.right,head);

    }
}
