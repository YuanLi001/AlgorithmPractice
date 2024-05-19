package com.example.algorithmpractice.abishi.shuzimali;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/15 20:34
 */
public class t11 {

    private static int n;
    private static int m;
    private static int sum=0;
    private static ArrayList<Node> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<Node> list=new ArrayList<>();
        jiahe(1);


    }

    public static void jiahe(int index){
        Node node=new Node(index);
        sum+=index;
        list.add(node);
        if(sum==m){
            for (int i = 0; i < list.size(); i++) {
                if(i==0){
                    System.out.print(list.get(i).val);
                }else {
                    System.out.print(" "+list.get(i).val);
                }
            }
            System.out.println();
        }
        for (int i = index+1; i <=n ; i++) {
            jiahe(i);
        }
        sum-=index;
        list.remove(node);

    }

    static class Node{
        int val;



        public Node(int val) {
            this.val = val;
        }
    }
}










//        for (int i = 1; i <= n; i++) {
//            for (int j = i+1; j <=n ; j++) {
//                for (int k = j+1; k <=n ; k++) {
//                    for (int l = k+1; l <=n ; l++) {
//
//                    }
//                }
//            }
//        }
