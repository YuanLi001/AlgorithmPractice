package com.example.algorithmpractice.bishi;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/4/25 14:33
 */
public class t4 {
    public static void main(String[] args) {
//        String str ="CUMULATIVE_FEEDING_DEVIATION_WANING";
//        String str2="CUMULATIVE_FEEDING_DEVIATION_WANING";
//        System.out.println(str.equals(str2));

//        StringBuilder sb = new StringBuilder();
//        sb.append("123");
//        System.out.println(sb);
//        String a=null;
//        sb.append(a);
//        System.out.println(sb);

        Date date = setDateBeginOffset(new Date(), 0);
        Date date1 = setDateEndOffset(new Date(), 0);
        System.out.println(new Date());
        System.out.println(date);
        System.out.println(date1);


    }

    public static Date setDateBeginOffset(Date date, int offset) {
        Date beginOfDay = DateUtil.beginOfDay(date);
        return DateUtil.offset(beginOfDay, DateField.DAY_OF_MONTH, offset);
    }

    public static Date setDateEndOffset(Date date, int offset) {
        Date beginOfDay = DateUtil.endOfDay(date);
        return DateUtil.offset(beginOfDay, DateField.DAY_OF_MONTH, offset);
    }
}
