package com.example.algorithmpractice.hot100.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/6 9:11
 */
public class t_32 {

    public int longestValidParentheses(String s){
        int left = 0, right = 0, maxlength = 0;
        //从左往右
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }
        //从右往左
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }
        return maxlength;
    }

}
