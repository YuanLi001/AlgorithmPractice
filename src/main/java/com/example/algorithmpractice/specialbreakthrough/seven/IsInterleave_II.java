package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/10 10:53
 */
public class IsInterleave_II {
    //状态转移方程
    //p=i+j-1
    // f(i,j)=[f(i-1,j) and s1(i-1)==s3(p)] or [f(i,j-1) and s2(j-1)==s3(p)]
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length(),m=s2.length(),t=s3.length();
        if(n+m!=t){
            return false;
        }
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=m ; j++) {
                if(i>0){
                    dp[i][j]=dp[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1);
                }
                if(j>0){
                    dp[i][j]=dp[i][j] || dp[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1);
                }
            }
        }
        return dp[n][m];
    }
}
