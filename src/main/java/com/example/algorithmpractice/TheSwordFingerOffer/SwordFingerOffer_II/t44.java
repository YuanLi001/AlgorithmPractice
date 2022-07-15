package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/30 15:43
 */
public class t44 {
    public int findNthDigit(int n) {
        int d = 1, count = 9;
        while (n > (long) d * count) {
            n -= d * count;
            d++;
            count *= 10;
        }
        int index = n - 1;
        int start = (int) Math.pow(10, d - 1);
        int num = start + index / d;
        int digitIndex = index % d;
        int digit = (num / (int)(Math.pow(10, d - digitIndex - 1))) % 10;
        return digit;
    }

}
