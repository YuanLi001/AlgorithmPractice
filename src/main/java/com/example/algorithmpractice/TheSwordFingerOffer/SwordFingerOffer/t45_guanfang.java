package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/25 18:57
 */
public class t45_guanfang {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
//        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }

}
