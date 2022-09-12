package com.example.algorithmpractice.specialbreakthrough.five;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/12 10:08
 */
public class FindMaximumXOR {
    TNode root = new TNode();

    public int findMaximumXOR(int[] nums) {
        buildTree(nums);
        int maxXor=Integer.MIN_VALUE;
        for(int num:nums){
            maxXor=Math.max( getMax(num),maxXor );
        }
        return maxXor;
    }

    public void buildTree(int[] nums) {
        for (int num : nums) {
            TNode cur = root;
            for (int i = 30; i >= 0; i--) {
                int n = num >> i & 1;
                if(cur.children[n]==null){
                    cur.children[n]=new TNode();
                }
                cur=cur.children[n];
            }
        }
    }

    public int getMax(int num){
        int xorNum=0;
        TNode cur = root;
        for (int i = 30; i >=0; i--) {
            int n = num >> i & 1;
            int theOther=(n-1)*-1;
            if(cur.children[theOther]!=null){
                xorNum=2*xorNum+theOther;
                cur=cur.children[theOther];
            }else {
                xorNum=2*xorNum+n;
                cur=cur.children[n];
            }
        }
        return num^xorNum;
    }
}

class TNode {
    TNode[] children = new TNode[2];
}
