package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/30 6:48
 */
public class MaxPathSum {
    int maxSum=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftGain=Math.max( maxGain(node.left),0 );
        int rightGain=Math.max( maxGain(node.right),0 );
        int currSum= node.val+leftGain+rightGain;
        maxSum=Math.max( maxSum,currSum );
//        return currSum;
        return node.val+Math.max( leftGain,rightGain ) ;
    }
}
