package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/20 19:58
 */
public class t58_I {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String res="";
        for (int i = s1.length-1; i >=0; i--) {
            String s2 = s1[i];
            if(!s2.equals("")){
                if(res.equals("")){
                    res+=s2;
                }else{
                    res=res+" "+s2;
                }
            }
        }
        return res;
    }

//    public String reverseWords2(String s) {
//        int left=0,rigth=s.length()-1;
//        while ( s.charAt(left)==' '){
//            left++;
//        }
//        while (s.charAt(rigth)==' '){
//            rigth--;
//        }
//        String substring = s.substring(left, rigth + 1);
//        substring.split(" ")
//        return ;
//    }


    public static void main(String[] args) {
////        String s="  aa  bb  ";
////        String s="  hello world!  ";
//        String s="  he  llo world!  ";
////        s.trim()
//        String[] s1 = s.split(" ");
////        String[] s2 = s.split();
//        for (int i = 0; i < s1.length; i++) {
//            System.out.println(i+":"+s1[i]+"长度为："+s1[i].length());
//        }
        String s="  aaa   ";
        String trim = s.trim();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(trim);
        System.out.println(trim.length());

    }
}
