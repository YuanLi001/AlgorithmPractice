package com.example.algorithmpractice.hot100.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/3 23:00
 */
public class t_17 {
//    public List<String> letterCombinations(String digits) {
//        List<String> combinations = new ArrayList<String>();
//        if (digits.length() == 0) {
//            return combinations;
//        }
//        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
//            put('2', "abc");
//            put('3', "def");
//            put('4', "ghi");
//            put('5', "jkl");
//            put('6', "mno");
//            put('7', "pqrs");
//            put('8', "tuv");
//            put('9', "wxyz");
//        }};
//        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
//        return combinations;
//    }
//
//    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
//        if (index == digits.length()) {
//            combinations.add(combination.toString());
//        } else {
//            char digit = digits.charAt(index);
//            String letters = phoneMap.get(digit);
//            int lettersCount = letters.length();
//            for (int i = 0; i < lettersCount; i++) {
//                combination.append(letters.charAt(i));
//                backtrack(combinations, phoneMap, digits, index + 1, combination);
//                combination.deleteCharAt(index);
//            }
//        }
//    }

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination){
        if(index==digits.length()){
            combinations.add( combination.toString() );
        }else {
            char ch = digits.charAt(index);
            String letters = phoneMap.get(ch);
            int length = letters.length();
            for (int i = 0; i < length; i++) {
                combination.append( letters.charAt(i) );
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }

}
