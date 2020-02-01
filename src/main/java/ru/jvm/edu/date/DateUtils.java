package ru.jvm.edu.date;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateUtils {

    public static final String FORMAT_DATE = "dd.MM.yyyy HH:mm";
    public static final String FORMAT_HOURLY = "HH:mm";

    public static String getFullDateString(String fmt, long timestamp, int timeZoneOffset) {
        return getDateString(fmt, timestamp, timeZoneOffset);
    }

    public static String getMoscowDateString(String fmt, long timestamp) {
        return getDateString(fmt, timestamp, TimeZone.getTimeZone("Europe/Moscow").getRawOffset());
    }

    public static String getDateString(String fmt, long timestamp, int timeZoneOffset) {
        LocalDateTime localDateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.ofTotalSeconds(timeZoneOffset));
        return localDateTime.format(DateTimeFormatter.ofPattern(fmt));
    }

    public static void main(String[] args) {
        System.out.println(DateUtils.getFullDateString(FORMAT_DATE, 1580590800, 36000));
    }
}
