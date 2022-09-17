package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/17 19:57
 */
public class MaxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        int maxValue=-1;
        for (int i = 0; i < s.length(); i++) {
            if( arr[ s.charAt(i)-'a' ]<0 ){
                arr[ s.charAt(i)-'a' ]=i;
            }else {
                maxValue=Math.max(maxValue, i-arr[ s.charAt(i)-'a' ]-1 );
            }
        }
        return maxValue;
    }
}
