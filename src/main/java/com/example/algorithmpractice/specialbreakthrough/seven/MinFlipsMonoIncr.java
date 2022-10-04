package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/4 10:12
 */
public class MinFlipsMonoIncr {
    public int minFlipsMonoIncr(String s) {
        int len = s.length();
        int dp0=0,dp1=0;
        for (int i = 0; i < len; i++) {
            int dp0New=dp0,dp1New=Math.min(dp0,dp1);
            char c = s.charAt(i);
            if(c=='1'){
                dp0New++;
            }else {
                dp1New++;
            }
            dp0=dp0New;
            dp1=dp1New;
        }
        return Math.min(dp0,dp1);
    }
}
