package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/19 8:26
 */
public class t48 {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(s==null|| len==0){
            return 0;
        }
        Set<Character> set=new HashSet<>();
        int rk=-1,cn=0;
        for (int i = 0; i < len; i++) {
//            char c = s.charAt(i);
            if(i!=0){
                set.remove(  s.charAt(i-1) );
            }
            while ( rk+1<len && !set.contains( s.charAt(rk+1)  )){
                set.add( s.charAt(rk+1) );
                rk++;
            }
            cn=Math.max(cn,rk-i+1);
        }
        return cn;
    }
}
