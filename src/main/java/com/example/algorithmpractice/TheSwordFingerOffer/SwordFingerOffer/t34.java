package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/23 21:34
 */
public class t34 {
    int sum=0;
    List<List<Integer>> listArr=new LinkedList<>();
    LinkedList<Integer> list=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root==null){
            return listArr;
        }
        dfs(root, target);
        return listArr;
    }

    public void dfs(TreeNode root, int target){
        if(root==null){
            return;
        }
        //到达此节点后，是否sum==target
        int value = root.val;
        sum+=value;
        list.add(value);
        System.out.println(sum);
        System.out.println(list);
        if(sum==target && root.left==null && root.right==null){
            LinkedList<Integer> theAddList=new LinkedList<>(list);
            listArr.add(theAddList);

        } else {
            dfs(root.left,target);
            dfs(root.right,target);

        }
        list.removeLast();
        sum-=value;
    }


    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.removeLast();
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
