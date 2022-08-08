package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/8 7:44
 */
public class t019 {
    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        if (s.equals(reverse)) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char cL = s.charAt(left);
            char cR = s.charAt(right);
            if (cL == cR) {
                left++;
                right--;
            } else {
                boolean lB = func(s, left + 1, right);
                boolean rB = func(s, left, right - 1);
                if(lB || rB){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean func(String s, int left, int right) {
        while (left < right){
            char cL = s.charAt(left);
            char cR = s.charAt(right);
            if(cL!=cR){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
