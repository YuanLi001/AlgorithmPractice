package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/1 8:58
 */
public class Partition {
    List<String[]> ans=new ArrayList<>();
    Deque<String> path=new ArrayDeque<>();
    int len;
    public String[][] partition(String s) {
        len=s.length();
        dfs(0,s.length()-1,s);
        String[][] strings = ans.toArray(new String[0][]);
        return strings;
    }
    public void dfs(int left,int right,String s){
        if(left==len){
            String[] strings = path.toArray(new String[path.size()]);
            ans.add(strings);
            return;
        }
        if(left>right){
            return;
        }
        if(check(s,left,right)){
            String substring = s.substring(left, right+1);
            path.addLast(substring);
            dfs(right+1,len-1,s);
            path.removeLast();
        }
        dfs(left,right-1,s);
    }
    public boolean check(String s,int start,int end){
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
