package com.example.algorithmpractice.abishi.shuzimali;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/15 19:23
 */
public class t1 {

    private static int sum=0;
    private static int n;
//    private static ArrayList list;
    private static Deque deque=new LinkedList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        jiahe(1,m);


    }

    public static void jiahe(int index,int m){
//        if(index>n){
//            return;
//        }
//        sum+=index;
//        deque.addLast(index);
//        if(sum==m){
//            Object[] objects = deque.toArray();
//            for (int i = 0; i < objects.length; i++) {
//                System.out.println("====");
//                System.out.println(objects[i]);
//            }
//            deque.removeLast();
//            sum-=index;
//            return;
//        }else if(sum>m){
//            deque.removeLast();
//            sum-=index;
//            return;
//        }
//        jiahe(index+1,m);
//        deque.removeLast();
//        sum-=index;
        sum+=index;
        deque.addLast(index);
        if(sum==m){
            Object[] objects = deque.toArray();
            for (int i = 0; i < objects.length; i++) {
                System.out.println("====");
                System.out.println(objects[i]);
            }
        }
        if(index+1<=n){
            jiahe(index+1,m);
        }
        deque.removeLast();
        sum-=index;
    }
}
