package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/10 15:44
 */
public class MinimumLengthEncoding {
    public int minimumLengthEncoding(String[] words) {
        Map<TrieNode, Integer> map = new HashMap<>();
        TrieNode trie=new TrieNode();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            TrieNode cur=trie;
            for (int j = s.length()-1; j >=0; j--) {
                cur = cur.get(s.charAt(j));

            }
            map.put(cur,i);
        }
        int ans=0;
        for(TrieNode node:map.keySet()){
            if(node.count==0){
                ans=ans+words[ map.get(node) ].length()+1;
            }
        }
        return ans;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    int count = 0;

    public TrieNode get(char c) {
        if (children[c - 'a'] == null) {
            count++;
            children[c - 'a'] = new TrieNode();
        }
        return children[c - 'a'];
    }
}
