package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/23 10:54
 */
public class SubarrayGCD {
    public int subarrayGCD(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%k==0){
                nums[i]=nums[i]/k;
            }else {
                nums[i]=0;
            }
        }
        int cn=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                continue;
            }
            for (int j = i; j < nums.length; j++) {
                if(nums[j]==0){
                    break;
                }
                boolean check = check(i, j, nums);
                if(check){
                    System.out.println(nums[j]);
                    cn++;
                }
            }
        }
        return cn;
    }

    public boolean check(int begin,int end,int[] nums){
        if(begin==end){
            if(nums[begin]==1){
                return true;
            }else {
                return false;
            }
        }else {
            int max=nums[begin],min=nums[begin];
            for (int i = begin+1; i <=end ; i++) {
                max=Math.max(max,nums[i]);
                min=Math.min(min,nums[i]);
            }
            if(max==min &&max>1){
                return false;
            }
            int x= (int) Math.sqrt(min)+2;
            for (int i = 2; i <=x ; i++) {
                int count=0;
                for (int j =begin; j <=end; j++) {
                    if(nums[j]%i==0){
                        count++;
                    }
                }
                if(count==(end-begin+1)){
                    return false;
                }
            }
            return true;
        }
    }

}
