package com.example.algorithmpractice.hot100.begin24;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/20 15:22
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA1=new ThreadA();
        threadA1.start();
        threadA1.join();
        ThreadA threadA2=new ThreadA();
        threadA2.start();
        threadA2.join();
        ThreadA threadA3=new ThreadA();
        threadA3.start();
        threadA3.join();
    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("abc"+i);
        }
    }
}