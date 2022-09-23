package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/23 15:57
 */
public class t1 {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new ArrayDeque<>();

    public List<List<Integer>> combine(int n, int k) {

        if (k <= 0 || n < k) {
            return res;
        }
        // 从 1 开始是题目的设定

        dfs(n, k, 1);
        return res;
    }

    private void dfs(int n, int k, int begin) {
        // 递归终止条件是：path 的长度等于 k
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 遍历可能的搜索起点
        for (int i = begin; i <= n; i++) {
            // 向路径变量里添加一个数
            path.addLast(i);
            // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
            dfs(n, k, i + 1);
            // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
            path.removeLast();
        }
    }
}
