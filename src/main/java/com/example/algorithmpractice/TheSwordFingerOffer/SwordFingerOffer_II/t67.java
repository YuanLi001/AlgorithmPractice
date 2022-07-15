package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/10 10:22
 */
public class t67 {
    public int strToInt(String str) {
        if( str==null || str.length()==0){
            return 0;
        }
        int len = str.length();
        int sign=1;
        //首先看是否有符号
        int i=0;
        while (i<len && str.charAt(i)==' '){
            i++;
        }
        if(i==len){
            return 0;
        }
        char first = str.charAt(i);
        if( !isDigit(first)&& first!='+' && first!='-' ){
            return 0;
        }
        //如果第一个不是数字，下一个必须是数字
        if( !isDigit(first)){
            if( first=='-'){
                sign=-1;
            }
            i++;
            if(i>=len || !isDigit( str.charAt(i) ) ){
                return 0;
            }
        }

        //是数字之后，在清除前置0
        int left=i;
        while (left<len && str.charAt(left)=='0'){
            left++;
        }
        //回到上一个位置
        if(left>0 && str.charAt(left-1)=='0' ){
            left--;
        }

        if(left>=len){
            return 0;
        }
        int right=left+1;
        while (right<len && isDigit(str.charAt(right)) ){
            right++;
        }
        //获得数字
        long value;
        //如果过长
        if( right-left >12){
            if(sign==-1){
                value=Integer.MIN_VALUE;
            }else{
                value=Integer.MAX_VALUE;
            }
        }else{
            String substring = str.substring(left, right);
            value= Long.parseLong(substring);
            if(sign==-1){
                value=-value;
            }
            if(value>Integer.MAX_VALUE){
                value=Integer.MAX_VALUE;
            }else if(value<Integer.MIN_VALUE){
                value=Integer.MIN_VALUE;
            }
        }
        return (int)value;
    }

    public boolean isDigit(char ch){
        if( ch>='0' &&ch<='9'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a=123;
        System.out.println(a);
        a=-a;
        System.out.println(a);
    }
}
