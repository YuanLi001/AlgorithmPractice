package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/6 9:49
 */
public class t014 {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        if(n>m){
            return false;
        }
        int[] cn=new int[26];
        for (int i = 0; i < n; i++) {
            cn[ s1.charAt(i)-'a' ]--;
            cn[ s2.charAt(i)-'a' ]++;
        }
        int diff=0;
        for(int num:cn){
            if(num!=0){
                diff++;
            }
        }
        if (diff == 0) {
            return true;
        }
        for (int i = n; i <m; i++) {
            int x=s2.charAt(i)-'a',y=s2.charAt(i-n)-'a';
            if(x==y){
                continue;
            }
            if( cn[x]==0 ){
                diff++;
            }
            cn[x]++;
            if(cn[x]==0){
                diff--;
            }
            if(cn[y]==0){
                diff++;
            }
            cn[y]--;
            if(cn[y]==0){
                diff--;
            }
            if(diff==0){
                return true;
            }
        }
        return false;
    }
}
