package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/3 8:12
 */
public class MyCalendar {

    int[] datas=new int[32];

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        for (int i = start; i < end; i++) {
            if(datas[i]==1){
                return false;
            }
        }
        for (int i = start; i < end; i++) {
            datas[i]=1;
        }
        return true;
    }
}