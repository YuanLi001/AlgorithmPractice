package com.example.algorithmpractice.hot100.qingfeng;

import java.util.ArrayList;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/21 9:35
 */
public class t1 {

    public ArrayList<Integer> FindHouse (int[] house) {
        ArrayList<Integer> res=new ArrayList<>();
        int f=0;
        int len=house.length;
        for (int i = 0; i <len ; i++) {
            if(f==0&&house[i]!=-1){
                int a=i-house[i];
                int b=i+house[i];
                if(a>=0&&a<len){
                    res.add(a);
                }
                if(b>=0&&b<len){
                    res.add(b);
                }
                f=1;
            }
            if(f==1&&house[i]!=-1){
                for (int j = 0; j < res.size(); j++) {
                    Integer num = res.get(j);
                    if( Math.abs(num-i)!=house[i]){
                        res.remove(j);
                    }
                }
            }
        }
        if(res.size()==0){
            for (int i = 0; i < house.length; i++) {
                res.add(i);
            }
        }
        return res;
    }

}
