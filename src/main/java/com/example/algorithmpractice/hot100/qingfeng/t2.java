package com.example.algorithmpractice.hot100.qingfeng;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/21 9:48
 */
public class t2 {


    public int Calc (int M, int N, int T) {
        // write code here
        int cn=0;
        ArrayList<Double> arr=new ArrayList<>();
        for (int i = 0; i < M; i++) {
            arr.add((double) 0);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Double time = arr.get(j);
                time-=1;
                arr.set(j,time);
            }
            for (int j = 0; j < M; j++) {
                Double time = arr.get(j);
                double t=0.5+((i*i)%T);
                if(time<=0){
                    arr.set(j,t);
                    cn++;
                }
            }

        }
        return cn;
    }


}
