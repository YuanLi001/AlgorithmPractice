package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/8 6:55
 */
public class Trie {

    private Map<Character,Trie> sons=new HashMap<>();

    /** Initialize your data structure here. */
    public Trie() {

    }
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(sons.isEmpty()|| !sons.containsKey(word.charAt(0))){
            addWord(word,this);
            return;
        }
        Trie theTrie=this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!theTrie.sons.containsKey(c)){
                String substring = word.substring(i);
                addWord(substring, theTrie);
                return;
            }
            theTrie=theTrie.sons.get(c);
        }
        //如果字母全部已存在，则在最后加个‘#’作为结束标志
        theTrie.sons.put('#',null);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie theTrie=this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!theTrie.sons.containsKey(c)){
                return false;
            }
            theTrie=theTrie.sons.get(c);
        }
        if(!theTrie.sons.containsKey('#')){
            return false;
        }
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie theTrie=this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(!theTrie.sons.containsKey(c)){
                return false;
            }
            theTrie=theTrie.sons.get(c);
        }
        return true;
    }

    public void addWord(String word,Trie trie){
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Trie newTrie=new Trie();
            trie.sons.put(c,newTrie);
            trie=newTrie;
        }
        trie.sons.put('#',null);
    }
}
