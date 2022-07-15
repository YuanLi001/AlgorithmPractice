package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/27 10:17
 */
public class t4 {
    public static void main(String[] args) {
//        int a='a';
//        int z='z';
//        System.out.println(a);
//        System.out.println(z);
        boolean anagram = isAnagram("aasda", "asdaa");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[150];
        int[] arr2=new int[150];
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int num;
        for (int i = 0; i < ch1.length; i++) {
            num=ch1[i];
            arr1[num]++;
        }
        for (int i = 0; i < ch2.length; i++) {
            num=ch2[i];
            arr2[num]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
