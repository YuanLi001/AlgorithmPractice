package com.example.algorithmpractice.hot100.youta;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/2/24 22:01
 */
public class t11 {
    public String solution(int arg1){
//        int a=1,b=1;
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j <1000 ; j++) {
                int va=zhishu(i);
                int vb=zhishu(j);
                if(j==i && va+vb>arg1){
                    return "-1";
                }
                if(va+vb==arg1){
                    return i+" "+j;
                }else if(va+vb>arg1){
                    break;
                }
            }
        }
        return "-1";
    }

    public int zhishu(int num){
        int v=1;
        for (int i = 0; i < num; i++) {
            v*=2;
        }
        return v;
    }
}
