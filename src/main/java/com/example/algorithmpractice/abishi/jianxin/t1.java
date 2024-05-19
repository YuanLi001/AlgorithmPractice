package com.example.algorithmpractice.abishi.jianxin;


public class t1 {

    public int countSeq (String mystr) {
        // write code here
        if(mystr==null || mystr.length()==0){
            return 0;
        }
        int c=0;
        int b=0;
        int f=0;
        int t=0;
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
        int sangezuixiao=0;
        sangezuixiao=Math.min(b,f);
        sangezuixiao=Math.min(sangezuixiao,t);
        if(sangezuixiao==0){
            return 0;
        }else if(c/2<sangezuixiao){
            return c/2;
        }else {
            return sangezuixiao;
        }

    }
}
