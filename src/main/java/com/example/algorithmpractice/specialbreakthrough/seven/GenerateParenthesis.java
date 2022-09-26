package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/26 14:49
 */
public class GenerateParenthesis {
//    int leftNums = 0;
//    int rightNums = 0;
//    int nums;
//    List<String> ans=new ArrayList<>();
//    StringBuilder sb=new StringBuilder();
//
//    public List<String> generateParenthesis(int n) {
//        leftNums = n;
//        rightNums = n;
//        nums = n * 2;
//        sb.append("(");
//        leftNums++;
//        dfs()
//    }
//
//    public void dfs()

    // 做加法

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        // 特判
        if (n == 0) {
            return res;
        }

        dfs("", 0, 0, n, res);
        return res;
    }

    /**
     * @param curStr 当前递归得到的结果
     * @param left   左括号已经用了几个
     * @param right  右括号已经用了几个
     * @param n      左括号、右括号一共得用几个
     * @param res    结果集
     */
    private void dfs(String curStr, int left, int right, int n, List<String> res) {
        if (left == n && right == n) {
            res.add(curStr);
            return;
        }

        // 剪枝
        if (left < right) {
            return;
        }

        if (left < n) {
            dfs(curStr + "(", left + 1, right, n, res);
        }
        if (right < n) {
            dfs(curStr + ")", left, right + 1, n, res);
        }
    }

}
