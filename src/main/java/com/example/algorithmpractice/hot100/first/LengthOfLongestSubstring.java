package com.example.algorithmpractice.hot100.first;

import java.util.HashSet;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/19 22:28
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashset=new HashSet<>();
        int rk=-1,n=s.length();
        int maxLen=0;
        for (int i = 0; i < n; i++) {
            if(i!=0){
                hashset.remove( s.charAt(i-1) );
            }
            while ( rk+1<n && !hashset.contains( s.charAt( rk+1 ) ) ){
                hashset.add( s.charAt(rk+1) );
                rk++;

            }
            maxLen=Math.max(maxLen,rk-i+1);
        }
        return maxLen;

    }
}
