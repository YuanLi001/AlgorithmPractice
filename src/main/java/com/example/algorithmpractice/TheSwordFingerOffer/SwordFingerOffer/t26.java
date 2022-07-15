package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/16 8:43
 */
public class t26 {
//    public static void main(String[] args) {
//        Integer i=null;
//        System.out.println(i);
//    }
//
//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        if(B==null || A==null){
//            return false;
//        }
//        //层序遍历b树
//        Deque<TreeNode> deque=new LinkedList<>();
//        deque.addFirst(B);
//        List<Integer> bValues=new ArrayList<>();
//        while (!deque.isEmpty()){
//            TreeNode first = deque.poll();
//            if(first==null){
//                bValues.add(null);
//            }else{
//                bValues.add(first.val);
//                deque.addLast(first.left);
//                deque.addLast(first.right);
//            }
//        }
//        int bSize = bValues.size();
//        //在bSize的基础上层序遍历A的某节点
//        Deque<TreeNode> aQue=new LinkedList<>();
//        aQue.addLast(A);
//        while (!aQue.isEmpty()){
//            TreeNode first = deque.poll();
//            if(first.val== B.val){
//                if(levelTraversal(first,bValues)){
//                    return true;
//                }
//            }
//        }
//    }
//
//    //对指定节点层序遍历包括null值，遍历值不超过b树的个数
//    public boolean levelTraversal(TreeNode Anode,List<Integer> bValues){
//
//    }

    public boolean isSubStructure(TreeNode A, TreeNode B){
        if(A==null||B==null){
            return false;
        }
        return recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean recur(TreeNode A, TreeNode B){
        if(B==null){
            return true;
        }
        if(A==null || A.val!=B.val){
            return false;
        }
        return recur(A.left,B.left) && recur(A.right,B.right);
    }

//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        return (A != null && B != null) && (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
//    }
//    boolean recur(TreeNode A, TreeNode B) {
//        if(B == null) return true;
//        if(A == null || A.val != B.val) return false;
//        return recur(A.left, B.left) && recur(A.right, B.right);
//    }

}
