package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/29 9:28
 */
public class PathSum {
    private int cn=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        Deque<TreeNode> stack=new LinkedList<>();
        List<TreeNode> list=new ArrayList<>();
        stack.add(root);
        list.add(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if(pop.left!=null){
                stack.push(pop.left );
                list.add(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
                list.add(pop.right);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            childSum(list.get(i),0,targetSum);
        }
        return cn;
    }

    public void childSum(TreeNode node,int sum,int targetSum){
        if(node==null){
            return;
        }
        sum+=node.val;
        if(sum==targetSum){
            System.out.println(node.val);
            cn++;
        }
        childSum(node.left,sum,targetSum);
        childSum(node.right,sum,targetSum);
//        childSum(node.left,0,targetSum);
//        childSum(node.right,0,targetSum);
    }
}
