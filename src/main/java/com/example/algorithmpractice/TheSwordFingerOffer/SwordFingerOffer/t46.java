package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/18 9:42
 */
public class t46 {
    public static int translateNum(int num) {
        if(num>=0&&num<=9){
            return 1;
        }else if(num>=10&&num<=25){
            return 2;
        }else if( num<100 ){
            return 1;
        }else {
            int n=num%100;
            if(n>=10&&n<=25){
                return translateNum(num/10)+translateNum(num/100);
            }else{
                return translateNum(num/10);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }
}
