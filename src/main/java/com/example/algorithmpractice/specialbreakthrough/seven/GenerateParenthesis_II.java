package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/29 17:23
 */
public class GenerateParenthesis_II {
    List<String> ans=new ArrayList<>();
    int leftNums=0;
    int rightNums=0;
    public List<String> generateParenthesis(int n) {
        dfs("",n);
        return ans;
    }

    public void dfs(String cur, int n){
        if(leftNums<rightNums){
            return;
        }
        if(leftNums<n){
            leftNums++;
            dfs(cur+"(",n);
            leftNums--;
        }
        if(rightNums<n){
            rightNums++;
            dfs(cur+")",n);
            rightNums--;
        }
        if(leftNums+rightNums==2*n){
            ans.add(cur);
        }

    }
}
