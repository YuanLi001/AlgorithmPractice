package com.example.algorithmpractice.hot100.baidu;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/13 20:01
 */
public class t2 {

    public static void main(String[] args) {
        int n=10000;
        long sum=0;
        for (int i = 0; i <n; i++) {
            sum=sum+(n-i);
        }
        System.out.println(n+":"+sum);
//        Deque
//        ArrayDeque
    }

}
