package com.example.algorithmpractice.specialbreakthrough.four;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/28 11:03
 */
public class garbageCollection {

    public int garbageCollection(String[] garbage, int[] travel) {
        int carM=0,carP=0,carG=0;
        int time=0;
        for (int i = 0; i < garbage.length; i++) {
            String g = garbage[i];
            if(g.contains("M")){
                int m = charCount(g, 'M');
                g.replace('M',' ');
                int runTime = carRunTime(travel, carM, i);
                carM=i;
                time=time+m+runTime;
            }
            if(g.contains("P")){
                int m = charCount(g, 'P');
                g.replace('P',' ');
                int runTime = carRunTime(travel, carP, i);
                carP=i;
                time=time+m+runTime;
            }
            if(g.contains("G")){
                int m = charCount(g, 'G');
                g.replace('G',' ');
                int runTime = carRunTime(travel, carG, i);
                carG=i;
                time=time+m+runTime;
            }
        }
        return time;
    }

    public int charCount(String s,char c){
        int cn=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                cn++;
            }
        }
        return cn;
    }

    public int carRunTime(int[] travel,int begin,int end){
        int time=0;
        if(begin==end){
            return 0;
        }else{
            for (int i = begin; i < end; i++) {
                time+=travel[i];
            }
        }
        return time;
    }
//    public void specCollection(String spec,)
}
