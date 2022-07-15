package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/26 12:52
 */
public class t3 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int f=0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j <chars.length; j++) {
                if(chars[i]==chars[j]&&(i!=j) ){
                    f=1;
                }
                if(f==1){
                    break;
                }
            }
            if(f==0){
                return i;
            }
            f=0;
        }
        return -1;

    }

    public int firstUniqChar2(String s) {
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(s.lastIndexOf(c)==s.indexOf( c )){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char a='a';
        int b=a;
        System.out.println(a);
        System.out.println(b);
    }

}
