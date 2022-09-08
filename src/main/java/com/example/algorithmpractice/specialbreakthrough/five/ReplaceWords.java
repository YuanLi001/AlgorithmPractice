package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/8 11:43
 */
public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort( (a,b)-> a.length()-b.length() );
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {
                if( s[i].startsWith( dictionary.get(j) ) ){
                    s[i]=dictionary.get(j);
                    break;
                }
            }
        }
        String ret=s[0];
        for (int i = 1; i < s.length; i++) {
            ret=ret+" "+s[i];
        }
        return ret;
    }
}
