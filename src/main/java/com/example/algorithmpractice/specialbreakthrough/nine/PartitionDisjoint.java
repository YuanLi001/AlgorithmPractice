package com.example.algorithmpractice.specialbreakthrough.nine;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/24 21:37
 */
public class PartitionDisjoint {
    int firstMax;
    int len;
    public int partitionDisjoint(int[] nums) {
        len=nums.length;
        firstMax=nums[0];
        return beCut(0,nums);
    }

    public int beCut(int firstEnd,int[] nums){
        int secBegin=firstEnd+1;
        int newFirstEnd=-1;
        for (int i = secBegin; i <len ; i++) {
            if(firstMax>nums[i]){
                newFirstEnd=i;
                break;
            }
        }
        if(newFirstEnd==-1){
            return firstEnd+1;
        }else {
            //更新左边数组的最大值
            for (int i = firstEnd+1; i <=newFirstEnd ; i++) {
                firstMax=Math.max(firstMax,nums[i]);
            }
            return beCut(newFirstEnd,nums);
        }
    }
}
