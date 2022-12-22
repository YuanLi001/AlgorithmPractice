package com.example.algorithmpractice.hot100.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/22 11:07
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2){
            return s;
        }
        int maxLen=1;
        int begin=0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp=new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i]=true;
        }
        char[] chars = s.toCharArray();
        // 先枚举子串长度
        for (int L = 2; L <=len; L++) {
            // 枚举左边界
            for (int i = 0; i < len; i++) {
                int j=L+i-1;
                if(j>=len){
                    break;
                }
                if(chars[i]!=chars[j]){
                    dp[i][j]=false;
                }else {
                    if(j-i+1<4){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if( dp[i][j] && j-i+1>maxLen ){
                    maxLen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring( begin,begin+maxLen );
    }

}
