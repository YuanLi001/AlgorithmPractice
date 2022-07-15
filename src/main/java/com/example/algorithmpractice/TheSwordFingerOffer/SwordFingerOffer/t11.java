package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/14 9:36
 */
public class t11 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if( (i+1)!=numbers.length && numbers[i]>numbers[i+1]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
