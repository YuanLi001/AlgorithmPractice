package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/27 11:12
 */
public class t6 {
    public static void main(String[] args) {
//        Long aLong = Long.valueOf("-12345");
//        System.out.println(aLong);
//        Long.valueOf()
//        int i = myAtoi("   -42wqe");
//        int i = myAtoi("words and 987");
//        int i = myAtoi("42");
//        int i = myAtoi("");
//        int i = myAtoi("3.14");
        int i = myAtoi("20000000000000000000");
        System.out.println(i);
    }

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int len= chars.length;
        int i=0;
//        while (i<len && (chars[i]!='-' &&  !Character.isDigit( chars[i] )  ) ){
//            i++;
//        }
        //1.丢弃无用的前导空格
        while (i<len && chars[i]==' ' ){
            i++;
        }
        //2.检查下一个字符（假设还未到字符末尾）为正还是负号
        while (i<len && (chars[i]=='-'||chars[i]=='+')){
            sb.append(chars[i]);
            i++;
            break;
        }
        //
//        while (i<len && ( chars[i]!='-' && !Character.isDigit( chars[i] )  ) ){
//            return 0;
//        }
        //3.读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
        while (i<len && !Character.isDigit( chars[i] )   ){
            return 0;
        }


        //4.读入数字,如果是第一个非零数字前面的0就不要放进去
        int f=0;
        while (i<len &&  Character.isDigit( chars[i] ) ){
            if( chars[i]!='0' ){
                f=1;
            }
            if(f==1){
                sb.append(chars[i]);
            }
            i++;
        }
        // 1.如果sb为空 2.sb长度为一但是符号   这两种情况要返回0
        if(sb.length()==0){
            return 0;
        }
        if(sb.length()==1 && (sb.charAt(0)=='-' || sb.charAt(0)=='+' ) )
        {
            return 0;
        }
        // 因为用了long类型来放数据，还要防止长度超过long的范围
        if(sb.length()>=12){
            if(sb.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
        String s1 = sb.toString();
        Long aLong = Long.valueOf(s1);
        if(aLong<Integer.MIN_VALUE){
            aLong=(long)Integer.MIN_VALUE;
        }
        if(aLong>Integer.MAX_VALUE){
            aLong=(long)Integer.MAX_VALUE;
        }
        return aLong.intValue();

    }
}
