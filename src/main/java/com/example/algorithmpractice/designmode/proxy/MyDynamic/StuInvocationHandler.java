package com.example.algorithmpractice.designmode.proxy.MyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/11/28 9:48
 */
public class StuInvocationHandler implements InvocationHandler {
    //invocationHandler持有的被代理对象
    private Object target;

    public StuInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        Object result = method.invoke(target, args);
        return result;
    }
}
