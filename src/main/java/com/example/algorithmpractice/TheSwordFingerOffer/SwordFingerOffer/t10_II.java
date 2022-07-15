package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/17 9:25
 */
public class t10_II {
    public int numWays(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        final int MOD=1000000007;
        int p=0,q=1,r=2;
        for (int i = 3; i <=n; i++) {
            p=q;
            q=r;
            r=(p+q)%MOD;
        }
        //3---- 1 2 3
        //4---- 2 3 5
        return r;
    }
}
