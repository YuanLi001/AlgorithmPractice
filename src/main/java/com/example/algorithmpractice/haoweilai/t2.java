package com.example.algorithmpractice.haoweilai;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/7 18:26
 */
public class t2 {

    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        System.out.println(list.get(0));
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }


}
