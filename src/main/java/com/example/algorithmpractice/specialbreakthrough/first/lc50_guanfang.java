package com.example.algorithmpractice.specialbreakthrough.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/7 12:00
 */
public class lc50_guanfang {

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

}
