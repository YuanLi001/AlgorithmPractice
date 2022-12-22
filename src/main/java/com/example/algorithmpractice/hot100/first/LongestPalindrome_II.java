package com.example.algorithmpractice.hot100.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/22 11:39
 */
public class LongestPalindrome_II {
    public String longestPalindrome(String s){
        if(s.length()<1 || s==null){
            return "";
        }
        int start=0,end=0;
        for (int i = 0; i < s.length(); i++) {
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            int len=Math.max( len1,len2);
            if(len>end-start+1){
                start=i-(len-1)/2;
                end=i+(len)/2;
            }

        }

        return s.substring(start,end+1);
    }

    public int expandAroundCenter(String s, int left, int right){
        while ( left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
            left--;
            right++;
        }
        return right-left-1;
    }
}
