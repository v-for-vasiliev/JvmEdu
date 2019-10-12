package ru.jvm.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTests {

    public static void testRegExp(String text, String pattern) {
        Matcher m = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE)
            .matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
