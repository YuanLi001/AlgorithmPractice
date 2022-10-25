package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.HashSet;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/25 18:58
 */
public class openLock {
    int count=0;
    public int openLock(String[] deadends, String target) {
        Set<String> beginBeVisited=new HashSet<>();
        Set<String> endBeVisited=new HashSet<>();
        Set<String> beVisited=new HashSet<>();
        Set<String> forbidden=new HashSet<>();
        //将死亡数字放入beVisited
        for(String s:deadends){
            forbidden.add(s);
        }
        beginBeVisited.add("0000");
        endBeVisited.add(target);
        beVisited.add("0000");
        beVisited.add(target);
        while (!beginBeVisited.isEmpty() && !endBeVisited.isEmpty()  ){
            if(beginBeVisited.size()> endBeVisited.size()){
                Set<String> temp=new HashSet<>();
                temp=beginBeVisited;
                beginBeVisited=endBeVisited;
                endBeVisited=temp;
            }
            Set<String> nextLevelNodes=new HashSet<>();
            for(String s:beginBeVisited){
                if(changeOneDigitEqualTarget(s,nextLevelNodes,beVisited,forbidden)){
                    return count+1;
                }
            }
            beginBeVisited=nextLevelNodes;

        }
        return -1;
    }

    public boolean changeOneDigitEqualTarget(String s,
                                             Set<String> nextLevelNodes,
                                             Set<String> beVisited,
                                             Set<String> forbidden
                                             ){
        char[] chars = s.toCharArray();
        int[] leftAndRight=new int[2];
        for (int i = 0; i < chars.length; i++) {
            char origChar=chars[i];
            //获得数字值
            int numericValue = Character.getNumericValue(origChar);
            leftAndRight[0]=(10+numericValue-1)%10;
            leftAndRight[1]=(numericValue+1)%10;
            for (int j = 0; j < 2; j++) {
                chars[i]=(char) ( leftAndRight[j]+48 );
                //重点研究一下
//                String newS = chars.toString();
                String newS = new String(chars);
                System.out.println(newS);
                //首先看是否是死亡数字
                if(forbidden.contains(newS)){
                    continue;
                }
                if(beVisited.contains(newS)){
//                    System.out.println(newS);
                    return true;
                }else {
                    nextLevelNodes.add(newS);
                    beVisited.add(newS);
                }

            }
            chars[i]=origChar;
        }
        count++;
        return false;
    }
}
