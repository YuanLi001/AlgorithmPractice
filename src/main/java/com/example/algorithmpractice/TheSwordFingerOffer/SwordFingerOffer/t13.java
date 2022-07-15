package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.Deque;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/23 14:03
 */
public class t13 {
    static int cn=0;
    static boolean[][] visited;
    static int theK;
    static int h;
    static int w;

    public static int movingCount(int m, int n, int k) {
        h=m;
        w=n;
        visited=new boolean[m][n];
        theK=k;
        check(0,0);
        return cn;
    }

    public static void check(int i,int j){
        if( i>=0&&i<h && j>=0&&j<w){
            if( !visited[i][j] ){
                visited[i][j]=true;
                if( compareK(i,j) ){
                    cn++;
                    check(i+1,j);
                    check(i,j+1);
                }

            }

        }

    }

    public static boolean compareK(int a,int b){
        int suma=0,sumb=0;
        while (a!=0){
            suma=suma+a%10;
            a/=10;
        }
        while (b!=0){
            sumb=sumb+b%10;
            b/=10;
        }
        if(suma+sumb >theK){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
//        int i = movingCount(16, 8, 4);
//        System.out.println(i);
        System.out.println(  true|false);
        System.out.println(  true|true);
        System.out.println(  false|false);
    }
}
