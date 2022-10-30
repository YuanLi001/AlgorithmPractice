package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/20 10:54
 */
public class qwe {
    public static void main(String[] args) {
//        System.out.println(5 &22);
////        System.out.println(22 / 22);


//        String s1 = Integer.toBinaryString(1);
//        System.out.println(s1);
//        String s2 = Integer.toBinaryString(2);
//        System.out.println(s2);
//        String s3 = Integer.toBinaryString(-1);
//        System.out.println(s3);
//        String s4 = Integer.toBinaryString(-2);
//        System.out.println(s4);
//        String s5 = Long.toBinaryString(-1);
//        System.out.println(s5);
//        String s6 = Long.toBinaryString(-2);
//        System.out.println(s6);
//        int i=-1;
//        String s7= Long.toBinaryString( (long) i);
//        System.out.println(s7);

//        int x= (int) Math.sqrt(3);
//        System.out.println(x);

//        char c='a';
//        System.out.println(c+1);
//        char ch='a';
//        ch++;
//        System.out.println(ch);
//        char c2='a';
//        c2= (char) (c2+1);
//        System.out.println(c2);

//        System.out.println(1^5);
//        System.out.println( (22-18)/2);
//        System.out.println(2^10);

//        System.out.println(Integer.toBinaryString(32));
//        System.out.println(Integer.toBinaryString(18));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(Integer.toBinaryString(21));
//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(10));
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(22));

//        String s="1234";
//        Object o;
//        char[] chars = s.toCharArray();
//        System.out.println(gcd(3,2));
//        System.out.println(gcd(3,0));
//        System.out.println(gcd(2,4));
//        System.out.println(gcd(4,2));
//        System.out.println(gcd(3,6));
//        System.out.println(gcd(9,6));
//        System.out.println(gcd(198,996));
//        System.out.println(198/6);
//        System.out.println(996/6);
        System.out.println(gcd(10000,9999));
        System.out.println(gcd(90000,9999));
        System.out.println(gcd(92300,9999));
        System.out.println(gcd(92301,9991));
        System.out.println(gcd(123451,543211));
    }

    public static int gcd(int a, int b){
        int cn=0;
        while (b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
            cn++;
        }
        System.out.println("cn="+cn);
        return a;
    }
}
