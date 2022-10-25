package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/24 19:20
 */
public class LadderLength_IIII {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        // 1.将wordList放到set集合中，便于判断某个单词是否在 wordList 里
        Set<String> wordSet=new HashSet<>(wordList);
        if(wordSet.size()==0 || !wordSet.contains(endWord)){
            return 0;
        }
        // 2.已经访问过的 word 添加到 visited 哈希表里
        Set<String> visited = new HashSet<>();
        // 分别用左边和右边扩散的哈希表代替单向 BFS 里的队列，它们在双向 BFS 的过程中交替使用
        Set<String> beginVisited = new HashSet<>();
        beginVisited.add(beginWord);
        Set<String> endVisited = new HashSet<>();
        endVisited.add(endWord);
        // 3.执行双向 BFS，左右交替扩散的步数之和为所求
        int step=1;
        while ( !beginVisited.isEmpty()&&!endVisited.isEmpty()){
            // 优先选择小的哈希表进行扩散，考虑到的情况更少
            if(beginVisited.size()>endVisited.size()){
                Set<String> temp = beginVisited;
                beginVisited = endVisited;
                endVisited = temp;
            }
            // 逻辑到这里，保证 beginVisited 是相对较小的集合，nextLevelVisited 在扩散完成以后，会成为新的 beginVisited
            Set<String> nextLevelVisited = new HashSet<>();
            for(String word:beginVisited){
                if (changeWordEveryOneLetter(word, endVisited, visited, wordSet, nextLevelVisited)) {
                    return step + 1;
                }
            }
            beginVisited = nextLevelVisited;
            step++;
        }
        return 0;
    }

    private boolean changeWordEveryOneLetter(String word, Set<String> endVisited,
                                             Set<String> visited,
                                             Set<String> wordSet,
                                             Set<String> nextLevelVisited) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            char originChar = charArray[i];
            for (char c = 'a'; c <='z' ; c++) {
                if (originChar == c) {
                    continue;
                }
                charArray[i] = c;
                String nextWord = String.valueOf(charArray);
                if (wordSet.contains(nextWord)){
                    if (endVisited.contains(nextWord)) {
                        return true;
                    }
                    if (!visited.contains(nextWord)) {
                        nextLevelVisited.add(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            charArray[i] = originChar;
        }
        return false;
    }
}
