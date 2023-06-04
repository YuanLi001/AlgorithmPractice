package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 11:31
 */
public class t10_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String theT = sc.nextLine();
        int left=0;
        int len = str.length();
        int[] leftPos=new int[len];
        int[] rightPos=new int[len];
        int leftIndex=0,rightIndex=0;
        int cn=0;
        //先算出左右指针所有可能的位置
        for (int i = 0; i < len; i++) {
            if(str.charAt(i)==theT.charAt(0)){
                leftPos[leftIndex]=i;
                leftIndex++;
            }
            if(str.charAt(i)==theT.charAt( theT.length()-1 )){
                rightPos[rightIndex]=i;
                rightIndex++;
            }
        }
        for (int i = leftIndex-1; i>=0; i--) {
            for (int j = 0; j <=rightIndex-1; j++) {
                int leftWeizhi=leftPos[i],rightWeizhi=rightPos[j];
                if(leftWeizhi<=rightWeizhi && (rightWeizhi-leftWeizhi+1)>=theT.length()){
                    String substring = str.substring(leftWeizhi, rightWeizhi + 1);
                    if(isSubsequence(substring,theT)){
                        cn=(leftWeizhi+1)*(str.length()-rightWeizhi);
                        System.out.println(cn);
                        return;
                    }
                }
            }
        }
        System.out.println(0);
    }

    public static boolean isSubsequence(String A, String B) {
        int i = 0;
        int j = 0;
        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == B.length();
    }
}
