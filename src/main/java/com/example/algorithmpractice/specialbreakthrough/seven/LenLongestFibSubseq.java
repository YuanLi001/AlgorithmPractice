package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/7 10:07
 */
public class LenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i],i);
        }
        int[][] dp = new int[n - 1][n];
        int ans=0;
        for (int i = 2; i < n; i++) {
            for (int j = i - 1; j > 0 && arr[j] * 2 > arr[i]; j--) {
                Integer index = map.get(arr[i] - arr[j]);
                if(index!=null){
                    dp[j][i]=Math.max(dp[index][j]+1,3);
                }
                ans=Math.max(ans,dp[j][i]);
            }
        }
        return ans;
    }
}
