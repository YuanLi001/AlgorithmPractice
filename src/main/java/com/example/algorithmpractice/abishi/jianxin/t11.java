package com.example.algorithmpractice.abishi.jianxin;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/20 19:55
 */
public class t11 {

    public int countSeq (String mystr) {
        // write code here
        if(mystr==null || mystr.length()==0){
            return 0;
        }
        long c=0;
        long b=0;
        long f=0;
        long t=0;
        char[] chars = mystr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='c' || chars[i]=='C'){
                c++;
            }
            if(chars[i]=='b' || chars[i]=='B'){
                b++;
            }
            if(chars[i]=='f' || chars[i]=='F'){
                f++;
            }
            if(chars[i]=='t' || chars[i]=='T'){
                t++;
            }
        }
        long sangezuixiao=0;
        sangezuixiao=Math.max(b,f);
        sangezuixiao=Math.max(sangezuixiao,t);
        if(sangezuixiao==0){
            return 0;
        }else if(c/2<sangezuixiao){
            return (int)c/2;
        }else {
            return (int)sangezuixiao;
        }

    }
}
