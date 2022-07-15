package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/28 22:56
 */
public class t68_II_up {
    List<TreeNode> list=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findNode(root,p);
        List<TreeNode> listOne=list;
        list=new ArrayList<>();
        findNode(root,q);
        List<TreeNode> listTwo=list;
        int tailOne = listOne.size()-1;
        int tailTwo = listTwo.size()-1;
        while (tailOne>=0 && tailTwo>=0){
            if( (tailOne==0||tailTwo==0) && listOne.get(tailOne).equals(  listTwo.get(tailTwo) )){
                return listOne.get(tailOne);
            }
            if(!listOne.get(tailOne).equals(  listTwo.get(tailTwo) ) && listOne.get(tailOne+1).equals(  listTwo.get(tailTwo+1) )){
                return listOne.get(tailOne+1);
            }
            tailOne--;
            tailTwo--;
        }
        return null;
    }

    public boolean findNode(TreeNode root, TreeNode p){
        if(root==null){
            return false;
        }
        if(root.val==p.val){
            list.add(root);
            return true;
        }else{
            if( findNode(root.left,p) ){
                list.add(root);
                return true;
            }else if( findNode(root.right,p) ){
                list.add(root);
                return true;
            }
        }
        return false;
    }
}
