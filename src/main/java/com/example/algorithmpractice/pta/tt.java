package com.example.algorithmpractice.pta;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 8:51
 */
public class tt {


    //解题核心是  三个因数：1和它本身，第三个因数a，a*a=n,且a为质数


    public static void main(String[] args) {
//        int len=
//        int i = countYinshu(6);
//        System.out.println(i);

//        int count=0;
//        for (int i = 4; i <=20221217 ; i++) {
//            int res = countYinshu(i);
//            if(res==3){
//                count++;
//            }
//        }
//        System.out.println(count);


//        boolean b = ifZhishu(6);
//        System.out.println(b);

        int cn=0;
//        for (int i = 4; i <=20221217 ; i++){
        for (int i = 4; i <=20221217 ; i++){
            double sqrt = Math.sqrt(i);
            int a=(int) sqrt;
            if(a*a==i && ifZhishu(a)){
                cn++;
            }
        }
        System.out.println(cn);

//        double a=1.1;
//        int b=(int) a;
//        System.out.println(b);

    }

    //num>1
//    public static int countYinshu(int num){
//        int cn=2;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if(num%i==0){
//                cn++;
//            }
//            if(cn>3){
//                return cn;
//            }
//        }
//        return cn;
//    }


    public static boolean ifZhishu(int num){

        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
