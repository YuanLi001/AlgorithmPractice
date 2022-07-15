package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/14 10:00
 */
public class t50 {
    public char firstUniqChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        Map<Character,Integer> map=new HashMap<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(map.containsKey( c )){
                Integer cn = map.get(c);
                map.put(c,cn+1);
            }else{
                map.put( c,1 );
            }
        }
        for (int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(map.containsKey( c ) && map.get(c)==1 ){
                return c;
            }
        }
        return ' ';
    }
}
