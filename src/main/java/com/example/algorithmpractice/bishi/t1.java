package com.example.algorithmpractice.bishi;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/2/22 14:17
 */
public class t1 {
    public static void main(String[] args) {
        int[] oneArr=new int[]{1,4,9};
        int[] twoArr=new int[]{0,1,4,9};
        int cn=0;
        for (int i = 0; i < oneArr.length; i++) {
            for (int j = 0; j < twoArr.length; j++) {
                for (int k = 0; k < twoArr.length; k++) {
                    System.out.println(oneArr[i]*100+twoArr[j]*10+twoArr[k]);
                    cn++;
                }
            }
        }
        System.out.println(cn);
    }
}
