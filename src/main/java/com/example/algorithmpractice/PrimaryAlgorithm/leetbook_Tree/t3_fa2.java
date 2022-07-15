package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/4 9:02
 */
public class t3_fa2 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()) {
            u = q.poll();
            v = q.poll();
            if (u == null && v == null) {
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)) {
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }


}
