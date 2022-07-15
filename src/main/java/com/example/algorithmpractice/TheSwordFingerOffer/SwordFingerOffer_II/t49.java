package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/22 23:16
 */
public class t49 {
//    public int nthUglyNumber(int n) {
//        if(n==1){
//            return 1;
//        }
//        TreeSet<Integer> set=new TreeSet<>();
//        set.add(1);
//        int cn=1;
//        while ( true ){
//            set.add( 2*cn );
//            if( set.size()==n){
//                break;
//            }
//            set.add( 3*cn );
//            if( set.size()==n){
//                break;
//            }
//            set.add( 5*cn );
//            if( set.size()==n){
//                break;
//            }
//            cn++;
//        }
//        return set.last();
//    }

//    public static void main(String[] args) {
//        int i = nthUglyNumber(7);
//        System.out.println(i);
//    }
//
//    public static int nthUglyNumber(int n){
//        if(n==1){
//            return 1;
//        }
//        int[] arr=new int[n];
//        arr[0]=1;
//        int cn=0;
//        for (int i = 2; i <=1690; i++) {
//            if( isUgly(i) ){
//                cn++;
//                arr[cn]=i;
//            }
//            if( (cn+1)==n ){
//                break;
//            }
//        }
//        return arr[cn];
//    }
//
//    public static boolean isUgly(int num){
//
//        //首先，至少含一个2,3,5质因子
//        if(num%2==0 || num %3==0 || num%5==0 ){
//            //含有的数，不能含2,3,5之外的质因子
//            for (int i = 2; i <=num/2 ; i++) {
//                if(num%i==0 && i!=2 && i!=3 && i!=5){
//                    return false;
//                 }
//            }
//            return true;
//        }else{
//            return false;
//        }
//    }

//    public static void main(String[] args) {
//        int i = nthUglyNumber(7);
//        System.out.println("i=="+i);
//
//    }

//    public static int nthUglyNumber(int n){
//        if(n==1){
//            return 1;
//        }
//        int[] arr=new int[n];
//        int cn=1;
//        int a=1,b=1,c=1;
//        int num1,num2,num3;
//        int max=0;
//        while (cn!=n){
//            num1=2*a;
//            num2=3*b;
//            num3=5*c;
//            System.out.println(num1);
//            System.out.println(num2);
//            System.out.println(num3);
//            System.out.println("=============");
//            if(num3<num1 && num3<num1){
//                max=num3;
//                c++;
//            }
//            if(num2<num3 && num2 <num1){
//                max=num2;
//                b++;
//            }
//            if(num1<num2 && num1<num3){
//                max=num1;
//                a++;
//            }
//            arr[cn]=max;
//            cn++;
//        }
//        return arr[cn-1];
//    }

    public static void main(String[] args) {
        int i = nthUglyNumber(11);
        System.out.println("i=="+i);

    }

    public static int nthUglyNumber(int n){
        if(n==1){
            return 1;
        }
        TreeSet<Integer> set=new TreeSet<>();
        set.add(1);
        int cn=1;
        while (cn!=n){
            set.add(2*cn);
            set.add(3*cn);
            set.add(5*cn);
            cn++;
        }
        int ret=0;
        for (int i = 0; i < n; i++) {
            ret=set.pollFirst();
        }
        return ret;
    }

}
