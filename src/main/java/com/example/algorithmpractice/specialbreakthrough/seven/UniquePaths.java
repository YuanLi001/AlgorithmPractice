package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/10 19:26
 */
public class UniquePaths {
//   2       6
// c       c
//   3       7

//  2                (m-1)
// c    8*7/2      c
//  8                 (m+n-2)
    public int uniquePaths(int m, int n) {
        int xia=m+n-2;
//         shang=m-1;
        int shang;
        if(m>xia/2){
            shang=xia-(m-1);
        }else {
            shang=m-1;
        }

        int cn=shang;
        long sum=1;
        while (cn!=0){
            sum*=xia;
            xia--;
            cn--;
        }
        cn=shang;
        while (cn!=0){
            sum/=shang;
            shang--;
            cn--;
        }
        return (int)sum;
    }
}
