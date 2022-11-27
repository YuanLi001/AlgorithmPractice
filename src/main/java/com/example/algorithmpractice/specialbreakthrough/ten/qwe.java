package com.example.algorithmpractice.specialbreakthrough.ten;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.transaction.TransactionStatus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/1 11:12
 */
public class qwe {
    public static void main(String[] args) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        map.put()
//        ConcurrentHashMap
//        AbstractQueuedSynchronizer
//        CountDownLatch
//        Thread
//        Future
//        Callable
//        FutureTask
//        ExecutorService
//        Executors

//        ThreadPoolExecutor
//        Timer
//        AtomicInteger

//        ReentrantReadWriteLock
//        AbstractQueuedSynchronizer
//        ReentrantLock
//        ReentrantReadWriteLock
//        CountDownLatch

//        ThreadLocal
//        PlatformTransactionManager
//        TransactionStatus
//        BeanDefinition
//        AbstractBeanDefinition
//        Object
        Person p1=new Person();
        Person p2=new Person();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println("=====================");
        Person p3=new Person("张三");
        Person p4=new Person("张三");
        Person p5=new Person("张四");
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());

    }


}
