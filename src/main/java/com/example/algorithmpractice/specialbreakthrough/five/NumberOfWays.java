package com.example.algorithmpractice.specialbreakthrough.five;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/4 17:09
 */
public class NumberOfWays {
    int MOD = 1000000007;
//C
//i
//j
//​
// =C
//i−1
//j
//​
// +C
//i−1
//j−1
//​
//
    public int numberOfWays(int startPos, int endPos, int k) {
        int d=endPos-startPos;
        if( (d+k)%2==1 || d>k ) return 0;
        int a=(d+k)/2;
        int[][] arr=new int[k+1][a+1];
        for (int i = 0; i <=k; i++) {
            arr[i][0]=1;
            for (int j = 1; j <=a; j++) {
                arr[i][j]=(arr[i-1][j]+arr[i-1][j-1])%MOD ;
            }
        }
        return arr[k][a];
    }
}
