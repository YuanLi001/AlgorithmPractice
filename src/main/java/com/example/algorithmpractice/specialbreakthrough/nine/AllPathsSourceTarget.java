package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/27 7:37
 */
public class AllPathsSourceTarget {
    Deque<Integer> path = new ArrayDeque<>();
    List<List<Integer>> res=new ArrayList<>();
    int n;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        n = graph.length;
        path.add(0);
        dfs(0, graph);
        return res;
    }

    public void dfs(int index, int[][] graph) {
        if (index == (n - 1)){
            res.add( new ArrayList<>(path));
            return;
        }
        int len = graph[index].length;
        for (int i = 0; i < len; i++) {
            path.addLast(graph[index][i]);
            dfs(graph[index][i],graph);
            path.removeLast();
        }
    }
}
