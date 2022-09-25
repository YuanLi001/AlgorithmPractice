package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/25 7:11
 */
public class CombinationSum2 {
    List<List<Integer>> res = new LinkedList<>();

    Deque<Integer> path = new ArrayDeque<>();

    Set<String> set=new HashSet<>();

    int sum=0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //排序是为了放在set里的key有序
        Arrays.sort(candidates);
        dfs(0,candidates,target);
        return res;
    }

    public void dfs(int begin,int[] candidates,int target){
        if(sum>target){
            return;
        }
        if(sum==target){
            String key = getKey(path);
            if(!set.contains(key)){
                set.add(key);
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            sum+=candidates[i];
            dfs(i+1,candidates,target);
            path.removeLast();
            sum-=candidates[i];
        }
    }

    public String getKey(Deque<Integer> path){
        Iterator<Integer> iterator = path.iterator();
        String s="";
        while (iterator.hasNext()){
            s=s+iterator.next();
        }
        return s;
    }
}
