package com.example.algorithmpractice.JUCPractice.createThread;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;


/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/12 13:38
 */
@Slf4j
public class d1 {
    public static void main(String[] args) {
//        Thread
//        Runnable
        Thread t1=new Thread( () -> {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

    }
}
