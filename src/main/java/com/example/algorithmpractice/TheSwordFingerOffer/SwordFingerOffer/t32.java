package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/15 8:18
 */
public class t32 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        Deque<TreeNode> deque=new LinkedList<>();
        deque.addFirst(root);
        TreeNode next=root;
        while (true){
            if(next.left!=null){
                deque.addLast(next.left);
            }
            if(next.right!=null){
                deque.addLast(next.right);
            }
            arrayList.add(next.val);
            deque.removeFirst();
            if(deque.size()==0 ){
                break;
            }else{
                next=deque.getFirst();
            }

        }
        System.out.println(arrayList);
        int len=arrayList.size();
        int[] arr=new int[len];
        for (int i = 0; i <len ; i++) {
            arr[i]=arrayList.get(i);
        }

        return arr;
    }



    public static void main(String[] args) {
//        System.out.println( new int[0] );
        int[] ints = new int[1];
        System.out.println("====");
        for (int num :
                ints) {
            System.out.println(num);
        }
        System.out.println("====");
    }
}

//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
//}

