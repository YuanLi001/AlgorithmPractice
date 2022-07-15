package com.example.algorithmpractice.part1_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/20 13:38
 */
public class s18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        int a,b,c,d;
        int num1,num2,num3,num4,sum;
        Arrays.sort(nums);
        int n= nums.length;
        for(a=0;a<=n-4;a++){
            if( a!=0&&nums[a]==nums[a-1]){
//                a++;
                continue;
            }
            num1=nums[a];
            for(b=a+1;b<=n-3;b++){
                if( b!=(a+1)&&nums[b]==nums[b-1]){
//                    b++;
                    continue;
                }
                num2=nums[b];
                for(c=b+1,d=n-1;c<=n-2&&c!=d;){
                    //防止出现重复
                    if( c!=(b+1)&&nums[c]==nums[c-1]){
                        c++;
                        continue;
                    }
                    if( d!=(n-1)&&nums[d]==nums[d+1]){
                        d--;
                        continue;
                    }
                    //
                    num3=nums[c];
                    num4=nums[d];
                    sum=num1+num2+num3+num4;
                    if(sum==target){
                        List<Integer> theNums=new ArrayList<>();
                        theNums.add(num1);
                        theNums.add(num2);
                        theNums.add(num3);
                        theNums.add(num4);
                        arr.add(theNums);
                        c++;
                    }else if(sum<target){
                        c++;
                    }else{
                        d--;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = fourSum(new int[]{-1, 0, 1, 2, -1, -4}, -1);
        System.out.println(lists);
    }
}
