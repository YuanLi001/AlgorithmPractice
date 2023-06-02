package com.example.algorithmpractice.hot100.cursor;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/18 20:28
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//用Java实现一段代码，当我输入一个网址时，他能够抓取该网址中出现的所有人名，并告诉我出现了几次
public class MyTest {
    public static void main(String[] args) throws Exception {
//        URL url = new URL("https://www.example.com");
        URL url = new URL("https://www.baidu.com/");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            Pattern pattern = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                count++;
                System.out.println(matcher.group());
            }
        }
        System.out.println("Total count: " + count);
    }
}