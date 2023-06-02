package com.example.algorithmpractice.bishi;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/4/25 10:24
 */
public class test3 {
    public static void main(String[] args) {
//        Date exceptionDate=new Date();
////        Integer calculateDays=-7;
//        Integer calculateDays=0;
//        Date date = setDateBeginOffset(exceptionDate, calculateDays);
//        Date date1 = setDateEndOffset(exceptionDate, 0);
//        System.out.println(exceptionDate);
//        System.out.println(date);
//        System.out.println(date1);

        Date exceptionDate=new Date();
        Date begin = setDateBeginOffset(new Date(), 0);
        Date end = setDateEndOffset(new Date(), 0);
        System.out.println("exceptionDate:"+exceptionDate);
        System.out.println("begin:"+begin);
        System.out.println("end:"+end);
    }

    private static Date setDateBeginOffset(Date date, int offset) {
        Date beginOfDay = DateUtil.beginOfDay(date);
        return DateUtil.offset(beginOfDay, DateField.DAY_OF_MONTH, offset);
    }

    private static Date setDateEndOffset(Date date, int offset) {
        Date beginOfDay = DateUtil.endOfDay(date);
        return DateUtil.offset(beginOfDay, DateField.DAY_OF_MONTH, offset);
    }
}
