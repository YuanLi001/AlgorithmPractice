package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/8 7:31
 */
public class t018 {
    public boolean isPalindrome(String s) {
        int len=s.length();
        if(len==0||len==1){
            return true;
        }
        int left=0,right=len-1;
        s=s.toLowerCase();
        while (left<right){
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);
            if(!Character.isLetterOrDigit(cLeft)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(cRight)){
                right--;
                continue;
            }
            if(cLeft==cRight){
                left++;
                right--;
            }else {
                return false;
            }

        }
        return true;
    }
}
