package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/30 9:53
 */
public class t07 {
    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder,inorder,0,n-1,0,n-1);
    }

    public TreeNode myBuildTree(int[] preorder, int[] inorder,
                                int pre_left,int pre_right,
                                int in_left,int in_right){

        if (pre_left > pre_right) {
            return null;
        }
        // 前序遍历中的第一个节点就是根节点
        int pre_root = pre_left;
        int in_root = indexMap.get(preorder[pre_root]);
        TreeNode treeNode=new TreeNode( preorder[pre_root] );
        int leftNums=in_root-in_left;
        treeNode.left=myBuildTree(preorder,inorder,pre_left+1,pre_left+leftNums,
                in_left,in_root-1);
        treeNode.right=myBuildTree(preorder,inorder,pre_left+leftNums+1,pre_right,
                in_root+1,in_right);
        return treeNode;
    }
}
