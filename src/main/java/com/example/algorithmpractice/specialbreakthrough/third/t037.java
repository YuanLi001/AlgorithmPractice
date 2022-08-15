package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/15 8:22
 */
public class t037 {
    public int[] asteroidCollision1(int[] asteroids) {
        Deque<Integer> stack=new LinkedList<>();
        int[] res=new int[asteroids.length];
        int cn=0;
        for (int i = 0; i < asteroids.length; i++) {
            int num = asteroids[i];
            if(stack.isEmpty() && num<0){
                res[cn]=num;
                cn++;
                continue;
            }
            if(num>0){
//                stack.push();
            }
//            if( num<0){
//                res[cn]=num;
//                cn++;
//            }else{
////                stack.push(asteroids[i]);
//            }

        }
//        while (!stack.isEmpty()){
//            Integer end1 = stack.pop();
//            Integer end2 = stack.pop();
//            if()
//        }
        return null;
    }

    public int[] asteroidCollision(int[] asteroids){
        Deque<Integer> stack=new LinkedList<>();
        for (int i = 0; i < asteroids.length; i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
            }else{
                Integer peek = stack.peek();
                if(peek<0){
                    stack.push(asteroids[i]);
                }else{
                    if(asteroids[i]>0){
                        stack.push(asteroids[i]);
                    }else{
                        //peek>0 asteroids[i]<0
                        if(peek+asteroids[i]==0){
                            stack.pop();
                        }else{
                            stack.pop();
                            int num= peek> -asteroids[i] ? peek :asteroids[i];
                            asteroids[i]=num;
                            i--;
                        }
                    }
                }
            }
        }
        int len=stack.size();
        int[] res=new int[len];
        for (int i = len-1; i >=0 ; i--) {
            res[i]=stack.pop();
        }
        return res;
    }
}
