package com.example.algorithmpractice.hot100.begin24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/20 12:37
 */
public class t6_II {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> output=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int num:nums){
            output.add(num);
        }
        back(nums.length, output,0,res);
        return res;
    }

    public void back(int len,List<Integer> output,int index,List<List<Integer>> res){
        if(index==len){
//            res.add(output);
            res.add(new ArrayList<>(output));
        }
        for (int i = index; i < len; i++) {
            Collections.swap(output,i,index);

            back(len,output,index+1,res);

            Collections.swap(output,index,i);
        }
    }
}
