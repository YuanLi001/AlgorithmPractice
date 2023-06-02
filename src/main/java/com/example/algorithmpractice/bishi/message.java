package com.example.algorithmpractice.bishi;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/5/12 16:06
 */
public class message {

//    public static final String COMPANY_CARGO_SPACE_CODE_LOCK =  "company_id:{0},cs_code:{1}";
//    public static void main(String[] args) {
//        String lockKey = MessageFormat.format(COMPANY_CARGO_SPACE_CODE_LOCK, "123", "456");
//        System.out.println(lockKey);
//    }

    public static void main(String[] args) {
//        String str=",,,";
//        String[] split = str.split(",");
//        System.out.println(split.length);
//        for()

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.summingInt(Integer::intValue), // 求和
                        sum -> sum * sum // 平方
                ));
        System.out.println(result);
    }
}
