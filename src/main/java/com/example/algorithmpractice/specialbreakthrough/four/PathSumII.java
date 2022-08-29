package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/29 10:26
 */
public class PathSumII {
    private int cn=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<TreeNode> list=new ArrayList<>();
        queue.offer(root);
        list.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            if(poll.left!=null){
                queue.offer( poll.left );
                list.add(poll.left);
            }
            if(poll.right!=null){
                queue.offer( poll.right);
                list.add(poll.right);
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
    }
}
