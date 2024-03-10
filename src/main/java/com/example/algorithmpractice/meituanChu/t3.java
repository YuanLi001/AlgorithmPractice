package com.example.algorithmpractice.meituanChu;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/9 10:24
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[][] arr=new int[n][n];
        char[][] arr=new char[n][n];
        //赋值
        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j]=sc.nextInt();
//            }
            String str = sc.nextLine();
            arr[i]=str.toCharArray();
        }
        System.out.println(0);
        for (int i = 2; i <= n; i++) {
            //奇数直接结束
            int geziSum=i*i;
            if(geziSum%2!=0){
                System.out.println(0);
                continue;
            }
            int cn=0;
            for (int j = 0; j < n - i + 1; j++) {
                for (int k = 0; k < n - i + 1; k++) {
                    //只能选择j,k这里面的数字做左上角的点

                    int oneNum = 0;
                    for (int l = j; l < j + i; l++) {
                        for (int m = k; m < k + i; m++) {
                            if (arr[l][m] == '1') {
                                oneNum++;
                            }
                        }
                    }
                    if (oneNum == (geziSum / 2)) {
                        cn++;
                    }
                } 
            }
            System.out.println(cn);
        }
    }
}
