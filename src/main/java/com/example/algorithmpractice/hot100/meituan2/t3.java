package com.example.algorithmpractice.hot100.meituan2;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/18 10:50
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();

        StringBuilder sb=new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String reverseStr=reverse.toString();
        char[] chars = str.toCharArray();
        //本来就是回文
        if(str.equals( reverseStr )){
            int end;
            if( length%2==0 ){
                end=length/2-1;
            }else {
                end=length/2;
            }
            for (int i = 0; i <=end ; i++) {
                if(chars[i]!='a'){
                    chars[i]='a';
                    chars[length-1-i]='a';
                    break;
                }
            }
        }else {
            //不是回文，检查不一样的个数
            int left=0,right=length-1;
            int cn=0;
            int[][] arr=new int[2][2];
            while (left<right){
                if( chars[left]!=chars[right] ){
                    arr[cn][0]=left;
                    arr[cn][1]=right;
                    cn++;
                }
                left++;
                right--;
            }
            if(cn==2){
                for (int i = 0; i < 2; i++) {
                    char l=chars[ arr[i][0] ];
                    char r=chars[ arr[i][1] ];
                    char change=l<r? l:r;
                    chars[ arr[i][0] ]=change;
                    chars[ arr[i][1] ]=change;
                }
            }else {
                if(length%2==0){
                    chars[ arr[0][0] ]='a';
                    chars[ arr[0][1] ]='a';
                }else {
                    if( chars[ arr[0][0] ] !='a' && chars[ arr[0][1] ]!='a' ){
                        chars[ arr[0][0] ]='a';
                        chars[ arr[0][1] ]='a';
                    }else if(chars[ arr[0][0] ] !='a'){
                        chars[ arr[0][0] ]='a';
                        chars[ length/2 ]='a';
                    }else {
                        chars[ arr[0][1] ]='a';
                        chars[ length/2 ]='a';
                    }
                }
            }

        }
        String res=new String(chars);
        System.out.println(res);
    }

}

//偶数
//本来就是回文   第一个不是a的 把前后一起换成a
//2对(4个)不一样   前面不是a，前面换，前面的是a，后面换a  /////// 换成不一样的一对中较小的字符
//1对(2个)不一样   前面不是a，前面换，前面的是a，后面换a
//奇数
//本来就是回文   第一个不是a的 把前后一起换成a
//2对(4个)不一样   前面不是a，前面换，前面的是a，后面换a
//1对(2个)不一样   前面不是a，前面换，前面的是a，后面换a  && 尝试把中间那个换成a

// 0 1 2 3
// 0 1 2 3 4