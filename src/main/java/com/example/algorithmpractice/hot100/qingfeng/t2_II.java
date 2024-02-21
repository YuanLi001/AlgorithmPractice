package com.example.algorithmpractice.hot100.qingfeng;

import java.util.ArrayList;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/21 10:08
 */
public class t2_II {
    public static int Calc (int M, int N, int T) {
        // write code here
        int cn=0;
        ArrayList<Double> arr=new ArrayList<>();
        for (int i = 0; i < M; i++) {
            arr.add((double) 0);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Double time = arr.get(j);
                if(time>0){
                    time-=1;
                    arr.set(j,time);
                }

            }
            for (int j = 0; j < M; j++) {
                Double time = arr.get(j);
                double t=0.5+((i*i)%T);
                if(time<=0){
                    arr.set(j,t);
                    cn++;
                    break;
                }
            }

        }
        return cn;
    }

    public static void main(String[] args) {
        int calc = Calc(1, 10, 1000);
        System.out.println(calc);
    }
}
