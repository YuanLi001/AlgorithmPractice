package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/26 8:17
 */
public class PermuteUnique {
    List<List<Integer>> res = new LinkedList<>();

    Deque<Integer> path = new ArrayDeque<>();

    boolean[] used;

    int depth;

    int len;

    public List<List<Integer>> permuteUnique(int[] nums) {
        depth= nums.length;
        len=depth;
        used=new boolean[len];
        Arrays.sort(nums);
        dfs(nums);
        return res;
    }

    public void dfs(int[] nums){
        if(path.size()==depth){
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < len; i++) {
            //检查这个元素是不是在之前出现过
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            if(!used[i]){
                used[i]=true;
                path.addLast(nums[i]);
                dfs(nums);
                used[i]=false;
                path.removeLast();
            }
        }
    }

}
