package com.example.algorithmpractice.saike;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:51
 */
public class zixvlie {
    public static boolean isSubsequence(String A, String B) {
        int i = 0;  // 指向字符串 A 的索引
        int j = 0;  // 指向字符串 B 的索引

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                j++;  // 匹配成功，移动到下一个字符
            }
            i++;  // 不管是否匹配成功，都需要移动到 A 的下一个字符
        }

        // 如果字符串 B 的所有字符都被匹配到了，则 B 是 A 的子序列
        return j == B.length();
    }

    public static void main(String[] args) {
//        String A = "abcde";
//        String B = "ace";
//        String A = "abcabcabc";
//        String B = "cba";

//        boolean isSub = isSubsequence(A, B);
        boolean isSub = isSubsequence("abac", "abc");
        System.out.println(isSub);  // 输出 true
    }
}
