package com.example.algorithmpractice.hot100.pddtest;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/12 19:39
 */
public class t3 {

    static int aN,bN,cN;
    static int aC,bC,cC;

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        char[][] chars=new char[n][3];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            chars[i]= str.toCharArray();
        }
        aN=sc.nextInt();
        aC=sc.nextInt();
        bN=sc.nextInt();
        bC=sc.nextInt();
        cN=sc.nextInt();
        cC=sc.nextInt();

    }

//    public void huisu

}
