package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/26 9:52
 */
public class t045 {
    int max=0;
    int val=0;
    List<TreeNode> list=new ArrayList<>();

    public int findBottomLeftValue(TreeNode root) {
        find(root);
        return val;
    }

    public void find(TreeNode node){
        if(node==null){
            return;
        }
        list.add(node);
        if(list.size()>max){
            max=list.size();
            val= node.val;
        }
        find(node.left);
        find(node.right);
        list.remove(node);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}