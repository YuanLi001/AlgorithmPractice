package com.example.algorithmpractice.hot100.changting;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/19 10:39
 */
public class td {
    public static int searchLastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lp = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lp = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        int target = scanner.nextInt();
        int lp = searchLastPosition(nums, target);
        System.out.println(lp);

    }
}
