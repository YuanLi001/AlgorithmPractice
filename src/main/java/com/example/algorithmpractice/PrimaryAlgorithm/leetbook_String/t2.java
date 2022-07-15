package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/26 11:49
 */
public class t2 {
    public int reverse(int x) {
        long res=0;
        if(x==0){
            return 0;
        }
        while (x!=0){
            int t=x%10;
            res=res*10+t;
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
                return 0;
            }
            x=x/10;
        }
        return (int)res;

    }

}
