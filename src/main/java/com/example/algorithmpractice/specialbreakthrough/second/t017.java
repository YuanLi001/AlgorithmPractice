package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/7 16:58
 */
public class t017 {
    public static String minWindow(String s, String t) {
        //提前对s进行优化，去掉后面无用的
        int sslen = s.length();
        if(sslen>10){
            while (true){
                char ccc = s.charAt(sslen - 1);
                int index = t.indexOf(ccc);
                if(index==-1){
                    sslen--;
                }else {
                    break;
                }
            }
        }

        s=s.substring(0,sslen);
        StringBuilder sb;
        int slen=s.length(),tlen=t.length();
        if(slen<tlen){
            return "";
        }
        int left,right;
        int min=100001,fLeft=0,fRight=0;
        String ret="";
        for (left = 0; left <=slen-tlen ; left++) {
            char c = s.charAt(left);
            int index = t.indexOf(c);
            if(index==-1){
                continue;
            }else{

                sb=new StringBuilder(t);
                sb.deleteCharAt(index);
                right=left+1;
                while (sb.length()!=0 &&right!=slen){
                    if( (slen-1-right+1)<sb.length() ){
                        break;
                    }
                    char cRight = s.charAt(right);
                    int sbIndex = sbIndexOf(cRight, sb);
                    if(sbIndex!=-1){
                        sb.deleteCharAt(sbIndex);
                    }
                    right++;
                }
                if(sb.length()!=0){
                    continue;
                }else{
                    int subLen=right-left;
                    if(min>subLen){
                        min=subLen;
                        fLeft=left;
                        fRight=right;
                    }
                }
            }

        }
        return min==100001? "":s.substring(fLeft,fRight);
    }

    public static int sbIndexOf(int ch,StringBuilder sb){
        for (int i = 0; i <sb.length() ; i++) {
            if(sb.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        minWindow("ADOBECODEBANC","ABC");
    }
}
