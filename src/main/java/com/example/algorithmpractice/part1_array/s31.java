package com.example.algorithmpractice.part1_array;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/21 9:27
 */
public class s31 {
//    public void nextPermutation(int[] nums) {
//        int  n= nums.length;
//        int f=0,tmp;
//        for (int i = n-1; i>=0; i--) {
//            if(i!=0&&nums[i]>nums[i-1]){
//                if(i==(n-1)){
//                    tmp=nums[i];
//                    nums[i]=nums[i-1];
//                    nums[i-1]=tmp;
//                    f=1;
//                    break;
//                }else{
//                    for(int j=i+1;j<=n-1;j++){
//                        if(nums[j]<=nums[i-1]){
//                            tmp=nums[j-1];
//                            nums[j-1]=nums[i-1];
//                            nums[i-1]=tmp;
//                            f=1;
//                            break;
//                        }
//                        if(j==(n-1)){
//                            tmp=nums[j];
//                            nums[j]=nums[i-1];
//                            nums[i-1]=tmp;
//                            f=1;
//                        }
//                    }
//                }
////                tmp=nums[i];
////                nums[i]=nums[i-1];
////                nums[i-1]=tmp;
////                f=1;    // 3 8 5 4 3 3 2 1
////                break;
//            }
//            if(f==1){
//                break;
//            }
//        }
//        if(f==0){
//            Arrays.sort(nums);
//        }
//    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, len);
                for (int j = i; j <len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
}
