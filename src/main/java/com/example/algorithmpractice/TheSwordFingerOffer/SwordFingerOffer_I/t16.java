package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/31 20:08
 */
public class t16 {
    public double myPow2(double x, int n) {
        double res=1;
        if(n==0){
            return 1;
        }
        int loopNum;
        if(n<0){
            loopNum=0-n;
        }else{
            loopNum=n;
        }
        for (int i = 1; i <=loopNum; i++) {
            res*=x;
        }
        if(n>0){
            return res;
        }else{
            return 1/res;
        }
    }

    public double myPow(double x, int n) {
        double res=x;
        if(n==0){
            return 1;
        }
        int loopNum;
        if(n<0){
            loopNum=0-n;
        }else{
            loopNum=n;
        }
        int i=1;
        while (i<loopNum){
            if(i+i<=loopNum){
                i+=i;
                res*=res;
            }else{
                i+=1;
                res*=x;
            }
        }
        if(n>0){
            return res;
        }else{
            return 1/res;
        }
    }

}
