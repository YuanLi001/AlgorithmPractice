package com.example.algorithmpractice.bishi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/2/24 13:44
 */
public class test {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < 16; i++) {
//            sb.append("7");
//        }
//        System.out.println(sb);
//        System.out.println(  System.currentTimeMillis() );


        String lastDayStr10 = getLastDayStr10();
        System.out.println(lastDayStr10);
    }

    public static String getLastDayStr10() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date date = cal.getTime();
        return getDateStr10(date);
    }

    public static String getDateStr10(Date date) {
        return date2String(date, "yyyy-MM-dd");
    }

    public static String date2String(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }
        return new SimpleDateFormat(pattern).format(date);
    }
}
