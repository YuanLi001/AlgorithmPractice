package com.example.algorithmpractice.designmode.proxy.MyCglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/28 11:13
 */

//首先实现一个MethodInterceptor，方法调用会被转发到该类的intercept()方法。
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB代理执行" +method.getName() + "方法");
        return methodProxy.invokeSuper(o, objects);
    }
}
