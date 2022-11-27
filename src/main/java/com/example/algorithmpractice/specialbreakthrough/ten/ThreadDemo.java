package com.example.algorithmpractice.specialbreakthrough.ten;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/23 12:41
 */
public class ThreadDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception
    {
        int i = 0;
        for(;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        FutureTask<Integer> ft = new FutureTask<>(threadDemo);
        new Thread(ft).start();
        System.out.println(ft.get());

    }
}
