package com.example.algorithmpractice.abishi.hailiang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/3 14:26
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        //3个a带2个b
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("==========");
        List<Integer> three=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        //1-14,2-15;
        int[] arr=new int[16];
        for (int i = 0; i < nums.length; i++){
            int x=nums[i];
            if(x==1){
                arr[14]++;
            }else if(x==2){
                arr[15]++;
            }else {
                arr[x]++;
            }
        }

        for (int i = 3; i <=15; i++){
            if(arr[i]>=3 && i>a){
                three.add(i);
            }
            if(arr[i]>=2){
                two.add(i);
            }
        }
        //如果其中一个为空结束
        if(three.size()==0 || two.size()==0){
            return;
        }
        //输出
        for (int i = 0; i < three.size(); i++) {
            int num=three.get(i);
            if(num==14){
                num=1;
            }else if(num==15){
                num=2;
            }

            for (int j = 0; j < two.size(); j++) {
                int numTwo=two.get(j);

                if(numTwo==14){
                    numTwo=1;
                }else if(numTwo==15){
                    numTwo=2;
                }
                if(numTwo==num){
                    continue;
                }
                System.out.print(num+","+num+","+num+",");
                System.out.println(numTwo+","+numTwo);
            }
        }

    }
}
