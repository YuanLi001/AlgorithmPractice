package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/4 10:50
 */
public class t4 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int levelSize;
        while (!queue.isEmpty()){
            levelSize= queue.size();
            List<Integer> levelNums=new ArrayList<>();
            for (int i = 0; i <levelSize; i++) {
                TreeNode node=queue.poll();
                levelNums.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ret.add(levelNums);
        }
        return ret;
    }
}
