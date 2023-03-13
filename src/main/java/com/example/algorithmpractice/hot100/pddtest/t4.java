package com.example.algorithmpractice.hot100.pddtest;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/12 19:49
 */
public class t4 {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        //teshu
        if(n==0){
            System.out.println(0);
            System.out.println(0);
        }
        LinkedList<Integer> list=new LinkedList<>();
        int[][] arr=new int[n][2];
        int sum=0;
        int mid;
        int num;
        int left,right;
//        double xiaoshu;
        for (int i = 0; i < n; i++) {
            num=sc.nextInt();
            sum+=num;
//            addMySort(list,num);
            list.add(num);
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });
            if( list.size()%2==0 ){
                left=list.size()/2;
                right=( list.size()+1 )/2;
                mid=( list.get(left)+ list.get(right) )/2;
                double xiaoshu=( list.get(left)+ list.get(right) )*1.0/2 - mid;
                if( xiaoshu>=0.5 ){
                    mid++;
                }
            }else {
                mid=list.get(list.size()/2);
            }
            int avg=sum/(i+1);
            double xiaoshu= sum*1.0/(i+1) - avg;
            if( xiaoshu>=0.5 ){
                avg++;
            }
            arr[i][0]=avg;
            arr[i][1]=mid;
        }
        for (int i = 0; i < n; i++) {
            if(i!=(n-1)){
                System.out.print(arr[i][0]+" ");
            }else {
                System.out.println(arr[i][0]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(i!=(n-1)){
                System.out.print(arr[i][1]+" ");
            }else {
                System.out.println(arr[i][1]);
            }
        }
    }

//    public static void addMySort(LinkedList<Integer> list,Integer num){
//        if(list.size()==0){
//            list.add(num);
//        }else {
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i)<num){
//                    list.add(i+1,num);
//                    return;
//                }
//            }
//        }
//    }

}
