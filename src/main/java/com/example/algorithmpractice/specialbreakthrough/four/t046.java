package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/26 10:15
 */
public class t046 {
    int depth=1;
    List<TreeNode> list=new ArrayList<>();
    List<Integer> values=new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        find(root);
        return values;
    }

    public void find(TreeNode node){
        if(node==null){
            return;
        }
        list.add(node);
//        if(list.size()>max){
//            max=list.size();
//            val= node.val;
//        }
        if(depth==list.size()){
            values.add( node.val );
            depth++;
        }
        find(node.right);
        find(node.left);
        list.remove(node);
    }
}
