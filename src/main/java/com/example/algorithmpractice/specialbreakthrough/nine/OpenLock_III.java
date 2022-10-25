package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.*;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/25 21:23
 */
public class OpenLock_III {
    String t,s;
    Set<String> set=new HashSet<>();

    public int openLock(String[] deadends, String target) {
        s="0000";
        t=target;
        if(s.equals(t)) return 0;
        for(String s:deadends) set.add(s);
        if(set.contains(s)) return -1;
        return bfs();
    }

    public int bfs(){
        Deque<String> d1=new ArrayDeque<>(),d2=new ArrayDeque<>();
        Map<String, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        d1.addLast(s);
        m1.put(s,0);
        d2.addLast(t);
        m2.put(t,0);
        while (!d1.isEmpty() && !d2.isEmpty()){
            int t=-1;
            if (d1.size() <= d2.size()) {
                t = update(d1, m1, m2);
            } else {
                t = update(d2, m2, m1);
            }
            if (t != -1) return t;
        }
        return -1;
    }

    public int update(Deque<String> deque, Map<String, Integer> cur, Map<String, Integer> other){
        int m=deque.size();
        while (m-->0){
            String poll = deque.pollFirst();
            char[] pcs = poll.toCharArray();
            int step = cur.get(poll);
            for (int i = 0; i < 4; i++){
                for (int j = -1; j <= 1; j++){
                    if (j == 0) continue;
                    int origin = pcs[i] - '0';
                    int next = (origin + j+10) % 10;

                    char[] clone = pcs.clone();
                    clone[i] = (char)(next + '0');
                    String str = String.valueOf(clone);

                    if (set.contains(str)) continue;
                    if (cur.containsKey(str)) continue;

                    if (other.containsKey(str)) {
                        return step + 1 + other.get(str);
                    } else {
                        deque.addLast(str);
                        cur.put(str, step + 1);
                    }
                }
            }

        }
        return -1;
    }
}
