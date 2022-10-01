package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/1 14:46
 */
public class RestoreIpAddresses_II {
    List<String> ans = new ArrayList<>();

    Deque<Integer> path = new ArrayDeque<>();

    public List<String> restoreIpAddresses(String s) {
        int len = s.length();
        if (len < 4 || len > 12) {
            return ans;
        }
        dfs(s, 0, len, 0);
        return ans;
    }

    public void dfs(String s, int left, int len, int depth) {
        if(depth>4){
            return;
        }
        if(left==len){
            if(depth==4){
                String str = "";
                Iterator<Integer> iterator = path.iterator();
                while (iterator.hasNext()) {
                    Integer next = iterator.next();
                    if (str.equals("")) {
                        str += next;
                    } else {
                        str = str + "." + next;
                    }
                }
                ans.add(str);
            }
            return;
        }

        if (left + 1 <= len) {
            String s1 = s.substring(left, left + 1);
            int num = Integer.parseInt(s1);
            path.addLast(num);
            dfs(s, left + 1, len, depth + 1);
            path.removeLast();
        }
        if (left + 2 <= len) {
            if(s.charAt(left)=='0'){
                return;
            }
            String s2 = s.substring(left, left + 2);
            int num = Integer.parseInt(s2);
            path.addLast(num);
            dfs(s, left + 2, len, depth + 1);
            path.removeLast();


        }
        if (left + 3 <= len) {
            String s3 = s.substring(left, left + 3);
            int num = Integer.parseInt(s3);
            if (num <= 255) {
                path.addLast(num);
                dfs(s, left + 3, len, depth + 1);
                path.removeLast();
            }
        }
    }
}
