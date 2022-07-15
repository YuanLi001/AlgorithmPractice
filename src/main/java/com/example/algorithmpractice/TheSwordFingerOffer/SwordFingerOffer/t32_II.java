package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/15 9:40
 */
public class t32_II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int cn=0;
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            cn++;
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if(cn%2==1){
                ret.add(level);
            }else{
                Collections.reverse(level);
                ret.add(level);
            }

        }

        return ret;
    }

}
