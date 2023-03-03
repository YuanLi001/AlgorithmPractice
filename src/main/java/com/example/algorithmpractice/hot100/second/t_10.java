package com.example.algorithmpractice.hot100.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/2/20 13:50
 */
public class t_10 {

//    public boolean isMatch(String s, String p) {
//        char[] firstChars = s.toCharArray();
//        char[] secondChars = p.toCharArray();
//        int lengthOne = firstChars.length;
//        int lengthTwo = secondChars.length;
//        int i=0,j=0;
//        while (i<lengthOne){
//            if(secondChars[j]=='.'){
//                if(j+1<lengthTwo && secondChars[j+1]!='*'){
//                    j++;
//                    i++;
//                    continue;
//                }else {
//
//                }
//            }
//            if(secondChars[j]=='*'){
//                if(firstChars[i]==secondChars[j-1]){
//                    i++;
//                    continue;
//                }else {
//                    j++;
//                    continue;
//                }
//            }
//            if(firstChars[i]==secondChars[j]){
//                i++;
//                j++;
//            }
//        }
//
//    }

    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }


}
