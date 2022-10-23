package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/23 10:40
 */
public class HaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        int res = event1[0].compareTo(event2[0]);
        String oneSec,twoFir;
        if(res<1){
            oneSec=event1[1];
            twoFir=event2[0];
        }else {
            oneSec=event2[1];
            twoFir=event1[0];
        }
        int i = oneSec.compareTo(twoFir);
        if(i>=0){
            return true;
        }else {
            return false;
        }
    }
}
