package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/14 15:20
 */
public class t37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "[]";
        }
        //层序遍历
        List<TreeNode> arr=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        arr.add(root);
        while ( !queue.isEmpty()){
            TreeNode poll = queue.poll();
            if(poll!=null){
                queue.add( poll.left);
                arr.add(poll.left);
                queue.add( poll.right);
                arr.add(poll.right);
            }
        }
        //去掉末尾的null
        int last = arr.size()-1;
        while ( arr.get(last)==null ){
            arr.remove(last);
            last--;
        }
        //开始拼接字符串
        String res="[";
        for (int i = 0; i <=last ; i++) {
            int val = arr.get(i).val;
            if(i==last){
                res=res+val+"]";
            }else {
                res=res+val+",";
            }
        }
        return res;
    }

    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//
//    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
