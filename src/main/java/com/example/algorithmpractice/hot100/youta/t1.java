package com.example.algorithmpractice.hot100.youta;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/2/24 21:54
 */
public class t1 {
    public String solution(int arg1) {
        // 在这⾥写代码
        int num=arg1%2;
        if(num!=0){
            return "-1";
//            System.out.println("-1");
        }else {
            if(num>2){

                return 1+" "+(num-1);
//                System.out.println("a和b");
            }else {
                return "-1";
//                System.out.println("-1");
            }
        }
//        return;
    }
}
