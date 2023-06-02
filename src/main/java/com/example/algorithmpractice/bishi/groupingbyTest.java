package com.example.algorithmpractice.bishi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/5/10 15:43
 */
public class groupingbyTest {
    public static void main(String[] args) {
        // 示例数据
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // 按照名字的长度分组
        Map<Integer, List<String>> groupedByNameLength = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByNameLength);
        List<String> list = groupedByNameLength.get(1);
        System.out.println(list);
    }
}
