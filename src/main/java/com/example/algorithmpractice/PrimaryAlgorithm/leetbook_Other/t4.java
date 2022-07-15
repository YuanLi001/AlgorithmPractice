package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/11 9:29
 */
public class t4 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retlist=new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> integerList=new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i){
                    integerList.add(1);
                }else{
                    Integer num1 = retlist.get(i - 2).get(j - 1);
                    Integer num2 = retlist.get(i - 2).get(j - 2);
                    integerList.add( num1+num2 );

                }
            }
            retlist.add(integerList);
        }
        return retlist;
    }
}
