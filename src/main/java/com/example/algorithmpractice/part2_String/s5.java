package com.example.algorithmpractice.part2_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/24 20:01
 */
class s5 {

    public String longestPalindrome(String s) {

        int len=s.length();
        if(len==1){
            return s;
        }
        int l=0,r=len-1;
        while (l<r){
            String substring = s.substring(l, r+1);

            if(   reverseEqual(substring) ){
                return substring;
            }else {
                String nextLeft = s.substring(l + 1, r + 1);
                if( reverseEqual(nextLeft) ){
                    return nextLeft;
                }
                String nextRight = s.substring(l, r + 1-1);
                if( reverseEqual(nextRight) ){
                    return nextRight;
                }
            }
            l++;
            r--;
        }
        return s.substring(0,1);
        
    }

    public boolean reverseEqual(String s){
        String rev = new StringBuffer(s).reverse().toString();
        return s.equals(rev);
    }
}
