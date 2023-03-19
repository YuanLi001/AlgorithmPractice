package com.example.algorithmpractice.hot100.third;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/18 21:44
 */
public class t_75 {

    public void sortColors(int[] nums){
        int n = nums.length;
        int ptr=0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }

}
