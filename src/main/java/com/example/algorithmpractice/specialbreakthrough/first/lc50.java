package com.example.algorithmpractice.specialbreakthrough.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/7 11:45
 */
public class lc50 {
//    public double myPow(double x, int n) {
//        int realCount=1,virtualCount=1;
//        if(n==0){
//            return 1;
//        }
//        int theN=n>0?n:-n;
//        double value=x;
//        while (realCount!=theN){
//            virtualCount+=virtualCount;
//            if(realCount<=n && virtualCount<=n){
//                realCount+=realCount;
//                value*=value;
//            }else{
//
//            }
//
//        }
//    }

//    public double myPow(double x, int n){
//        int count=1,virtualCount=1;
//        if(n==0){
//            return 1;
//        }
//        int theN=n>0?n:-n;
//        double value=x;
//        while (count!=n){
//            if( count+virtualCount<=n ){
//                value*=value;
//                count+=virtualCount;
//            }else {
//
//            }
//        }
//
//    }

    public double myPow(double x, int n){
        long N=n;
        return N>0? quickMul(x,N): 1.0/ quickMul(x,-N);
    }

    public double quickMul(double x, long n){
        if(n==0){
            return 1.0;
        }
        double y=quickMul(x,n/2);
        if(n%2==0){
            return y*y;
        }else{
            return y*y*x;
        }
    }
}
//x=5