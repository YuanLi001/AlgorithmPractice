package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/17 18:44
 */
public class CoinChange {
    int amount;
    int sum=0;
    int end;
    int res=Integer.MAX_VALUE;
    int cn=0;
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        this.amount=amount;
        end=coins.length-1;
        //数组逆序
        int[] arr=new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            arr[i]=coins[coins.length-1-i];
        }
        coins=arr;
        ///
        dfs(0,coins);
        if(res==Integer.MAX_VALUE && amount!=Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }

    public void dfs(int begin,int[] coins){
        if(sum>amount){
            return;
        }
        if(sum==amount){
            res=Math.min(cn,res);
        }
        for (int i = begin; i <=end ; i++) {
            sum+=coins[i];
            cn++;
            dfs(i,coins);
            sum-=coins[i];
            cn--;
        }
    }
}
