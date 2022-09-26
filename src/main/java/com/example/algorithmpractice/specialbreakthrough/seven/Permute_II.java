package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/26 7:50
 */
public class Permute_II {
    List<List<Integer>> res = new LinkedList<>();

    Deque<Integer> path = new ArrayDeque<>();

    boolean[] used;

    int depth;

    int len;

    public List<List<Integer>> permute(int[] nums){
        depth= nums.length;
        len=depth;
        used=new boolean[len];
        dfs(nums);
        return res;
    }

    public void dfs(int[] nums){
        if(path.size()==depth){
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < len; i++) {
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
