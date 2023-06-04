package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 11:10
 */
public class t10_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String theT = sc.nextLine();

        int cn=0;
        int left=0,right=str.length();
        int[] arr=new int[str.length()];
        int smCN=0;
        while (left<right && (right-left)>=theT.length() ){
            if(left==0){
                String sub=str.substring(left,right);
                boolean panduan = isSubsequence(sub, theT);
                if (panduan) {
                    smCN++;
                    right--;
                } else {
                    arr[left] = smCN;

                    smCN = 0;
                    left++;
                    right = str.length();
                }
            }else {
                if( str.charAt(left-1)!=theT.charAt(0) ){
                    arr[left]=arr[left-1];
                    left++;
                }else {
                    String sub = str.substring(left, right);
                    boolean panduan = isSubsequence(sub, theT);
                    if (panduan) {
                        smCN++;
                        right--;
                    } else {
                        arr[left] = smCN;

                        smCN = 0;
                        left++;
                        right = str.length();
                    }
                }
            }
            if(arr[left]==0){
                break;
            }
        }
        for (int i = 0; i < left; i++) {
            cn+=arr[i];
        }
        System.out.println(cn);
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

//    public static int getSMCN(){
//
//    }
}
