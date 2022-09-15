package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/15 7:34
 */
public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while ((i + 1) < intervals.length && right >= intervals[i + 1][0]) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            int[] arr = new int[]{left, right};
            list.add(arr);
        }
//        int[][] res = new int[list.size()][2];
//        for (int i = 0; i < list.size(); i++) {
//            res[i][0] = list.get(i)[0];
//            res[i][1] = list.get(i)[1];
//        }
//        return res;
        return list.toArray(new int[list.size()][]);
    }
}
