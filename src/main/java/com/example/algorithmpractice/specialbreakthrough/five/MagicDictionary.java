package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/10 11:11
 */
public class MagicDictionary {

    Map<Integer, List<String>> map=new HashMap<>();
    /** Initialize your data structure here. */
    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        for (int i = 0; i < dictionary.length; i++) {
            int len = dictionary[i].length();
            List<String> list = map.getOrDefault(len, new ArrayList<>());
            list.add(dictionary[i]);
            map.put(len,list);
        }
    }

    public boolean search(String searchWord) {
        int len = searchWord.length();
        List<String> list = map.get(len);
        if(list!=null){
            for (int i = 0; i < list.size(); i++) {
                int f=0;
                String s = list.get(i);
                for (int j = 0; j < len; j++) {
                    if(s.charAt(j)!=searchWord.charAt(j)) f++;
                    if(f>1) break;
                }
                if(f==1){
                    return true;
                }
            }
        }
        return false;
    }
}
