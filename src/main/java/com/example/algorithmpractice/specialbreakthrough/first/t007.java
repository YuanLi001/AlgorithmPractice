package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/7/27 9:23
 */
public class t007<E> {


//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> arr=new ArrayList<>();
//        int len = nums.length;
//        if(len==0){
//            return arr;
//        }
//        Arrays.sort(nums);
//        int first=nums[0],last=nums[len-1];
//        if( (first<0 && last<0) || (first>0 && last>0) ){
//            return arr;
//        }
//        int left=0,right=len-1;
//        int sum=0;
//        while (left<right){
//            sum=nums[left]+nums[right];
//            if(sum<0){
//                //找满足三个数的和为0的p
//                int p=right-1;
//                int threeSum;
//                while (p!=left){
//                    threeSum=sum+nums[p];
//                    if(threeSum==0){
//                        List<Integer> list=new ArrayList<>();
//                        list.add(nums[left]);
//                        list.add(nums[right]);
//                        list.add(nums[p]);
//                        arr.add(list);
//                        break;
//                    }
//                    p--;
//                }
//            }else{
//                int p=left+1;
//                int threeSum;
//                while (p!=right){
//                    threeSum=sum+nums[p];
//                    if(threeSum==0){
//                        List<Integer> list=new ArrayList<>();
//                        list.add(nums[left]);
//                        list.add(nums[right]);
//                        list.add(nums[p]);
//                        arr.add(list);
//                        break;
//                    }
//                }
//                p++;
//            }
//        }
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums); // O(nlogn)

        // O(n^2)
        for (int i = 0; i < nums.length; i++) {
            // 在 i + 1 ... nums.length - 1 中查找相加等于 -nums[i] 的两个数
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(res); // O(n)
    }


    public static void main(String[] args) {
//        List<List<Integer>> arr1=new ArrayList<>();
//        List<List<Integer>> arr2=new ArrayList<>();
////        System.out.println(arr);
//        Set<List<Integer>> set=new HashSet<>();
//        arr1.add(1);
//        arr1.add(2);

//        Set<List<Integer>> set=new HashSet<>();
//        List<Integer> arr1=new ArrayList<>();
//        List<Integer> arr2=new ArrayList<>();
//        arr1.add(1000000);
//        arr1.add(2);
//        arr2.add(1000000);
//        arr2.add(2);
//        set.add(arr1);
//        set.add(arr2);
//        System.out.println(set);
//        System.out.println(arr1.equals(arr2));
//        ArrayList<Integer> arr3=new ArrayList<>();
//        ArrayList<Integer> arr4=new ArrayList<>();
//        System.out.println(arr3.equals(arr4));


    }

    public void func(){
        ArrayList<E> arrayList=new ArrayList<>();
        E e;

    }
}
