package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/24 8:35
 */
public class CombinationSum {
    List<List<Integer>> ans=new ArrayList<>();

    Deque<Integer> path=new ArrayDeque<>();

    int sum=0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(0,candidates,target);
        return ans;
    }

    public void dfs(int begin,int[] candidates,int  targrt){
        if(sum>targrt){
            return;
        }
        if(sum==targrt){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            sum+=candidates[i];
            dfs(i,candidates,targrt);
            path.removeLast();
            sum-=candidates[i];
        }
    }
}
