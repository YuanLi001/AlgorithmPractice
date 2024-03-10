package com.example.algorithmpractice.meituanChu;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/9 10:07
 */
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr=new int[n];
        long sum=0;
        long zeroNum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if (arr[i] == 0) {
                zeroNum++;
            } else {
                sum += arr[i];
            }
        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                zeroNum++;
//            } else {
//                sum += arr[i];
//            }
//        }
//        while (true){
//
//        }
        for (int i = 0; i < q; i++) {
            long l=sc.nextInt();
            long h=sc.nextInt();
            //计算最小和最大
            long min=sum+zeroNum*l;
            long max=sum+zeroNum*h;
            System.out.println(min+" "+max);
        }
    }
}
