package com.example.algorithmpractice.hot100.tenxun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/26 20:03
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //格式化
        String s = sc.nextLine();
        String str=s.substring(1,s.length()-1);
        String[] split = str.split(",");
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        //是奇数还是偶数
        if(split.length%2==1){
            int end=split.length-1;
            int i=0;
            while (i<= split.length-2){
                ArrayList<String> list=new ArrayList<>();
                list.add(split[i]);
                list.add(split[i+1]);
                res.add(list);
                i=i+2;
            }
            ArrayList<String> last=new ArrayList<>();
            last.add( split[end] );
            res.add(last);
        }else {
            int i=0;
            while (i<= split.length-1){
                ArrayList<String> list=new ArrayList<>();
                list.add(split[i]);
                list.add(split[i+1]);
                res.add(list);
                i=i+2;
            }
        }
        for (int i = 0; i < res.size();) {
            if( (i+1)< res.size() ) {
                ArrayList<String> temp=res.get(i);
                res.set(i,res.get(i+1));
                res.set(i+1,temp);
            }
                i=i+2;
        }
        //输出
        String ans="{";
        for (int i = 0; i < res.size(); i++) {
            ArrayList<String> arrayList = res.get(i);
            for (int j = 0; j < arrayList.size(); j++) {
                if(i==0 && j==0){
                    ans+=arrayList.get(j);
                }else {
                    ans=ans+","+arrayList.get(j);
                }
            }
        }
        ans+="}";
        System.out.println(ans);
    }
}
//        for(String oneStr:split){
//            System.out.println(oneStr);
//        }
//        System.out.println(s);
