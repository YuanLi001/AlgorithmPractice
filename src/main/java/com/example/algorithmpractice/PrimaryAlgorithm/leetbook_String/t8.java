package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/28 19:28
 */
public class t8 {
    public static String countAndSay(int n) {
        String str="1";
        if(n==1){
            return str;
        }
        for (int i = 2; i <=n ; i++) {
            str = func( str  );
        }
        return str;
    }

    public static String func(String s ){
        String returnStr="";
        int count;
        int len=s.length();
        if(len==1){
            return "1"+s;
        }

        int i=0;
        while (i<len){
            count=1;
            if(i==0){
                if( s.charAt(0)!=s.charAt(1) ){
                    returnStr=returnStr+count + s.charAt(0);
                    i++;
                }else{
                    i++;
                }
            }else {
                if(  s.charAt(i)!=s.charAt(i-1) ){
                    if(i==(len-1) ||  i+1<=len-1 && s.charAt(i)!=s.charAt(i+1)){
                        returnStr=returnStr+count + s.charAt(i);

                    }

                    i++;

                }else{
                    while ( i<len && s.charAt(i)==s.charAt(i-1) ){
                        count++;
                        i++;
                    }
                    returnStr=returnStr+count + s.charAt(i-1);
                }
            }
        }


//            if(i==0 && s.charAt(0)!=s.charAt(1)){
//                returnStr=returnStr+count + s.charAt(0);
//                i++;
//            }else if( i==0 && s.charAt(0)==s.charAt(1)){
//                i++;
//            }else {
//                if(s.charAt(i)==s.charAt(i-1)) {
//                    while (s.charAt(i) == s.charAt(i - 1)) {
//                        count++;
//                        i++;
//                    }
//                    returnStr=returnStr+count + s.charAt(i-1);
//                }else{
//                    returnStr=returnStr+count + s.charAt(i-1);
//                    i++;
//                }
//
//            }
//
//
//        }

        return returnStr;
    }

    public static void main(String[] args) {
//        String s = countAndSay(1);
        String s = countAndSay(5);
        System.out.println(s);
    }

//    public static void main(String[] args) {
////        String s="";
////        s=s+123;
////        System.out.println(s);
////        System.out.println(s.equals("123"));
////        String s="1";
////        System.out.println(s);
////        s=s+'c';
////        System.out.println(s);
////        String s;
////        s=""+'c';
////        System.out.println(s);
//    }
}
