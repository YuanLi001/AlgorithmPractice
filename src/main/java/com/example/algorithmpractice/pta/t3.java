package com.example.algorithmpractice.pta;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 9:32
 */
public class t3 {

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum=0L;
//        int loop=n;
//        int num;
//        for (int i = 0; i < loop; i++) {
//            num = sc.nextInt();
//            sum=sum+n*num;
//            n--;
//        }
//        System.out.println(sum);
//        sc.close();
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] sArr = str.split(" ");
        int[] numArr=new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            numArr[i]=Integer.parseInt(sArr[i]);
        }
//        System.out.println(sArr);
        long sum=0L;
        int loop=n;
//        int num;
        for (int i = 0; i < loop; i++) {
//            num = sc.nextInt();
            sum=sum+n*numArr[i];
            n--;
        }
        System.out.println(sum);
        sc.close();
    }




//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum=0L;
//        int loop=n;
//        int preSum=0;
//        for (int i = 0; i < loop; i++) {
//            int num = sc.nextInt();
//            preSum+=num;
//            sum=sum+preSum;
//            n--;
//        }
//        System.out.println(sum);
//        sc.close();
//    }



    //        while (sc.hasNextInt()){
//            int num = sc.nextInt();
//            sum=sum+n*num;
//            n--;
//            System.out.println(sum);
//        }
//    1*3+1*2+1*1;
}
