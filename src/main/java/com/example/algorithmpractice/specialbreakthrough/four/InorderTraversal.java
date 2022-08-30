package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/30 9:34
 */
public class InorderTraversal {



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }

    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}
