package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/23 14:13
 */
public class Combine {

    List<List<Integer>> res = new LinkedList<>();

    Deque<Integer> path = new ArrayDeque<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return res;
    }

    public void dfs(int begin, int n, int k) {
        if(path.size()+n-begin<k){
            return;
        }
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i =begin; i <= n; i++) {
            path.addLast(i);
            dfs(i+1,n,k);
            path.removeLast();
        }
    }
}
