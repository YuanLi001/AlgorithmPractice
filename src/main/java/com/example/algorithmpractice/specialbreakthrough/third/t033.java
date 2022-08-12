package com.example.algorithmpractice.specialbreakthrough.third;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/12 18:48
 */
public class t033 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
