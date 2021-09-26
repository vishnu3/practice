package com.tp;

import java.util.Arrays;
import java.util.Comparator;

enum Weekdays {
    SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6);

    private Integer weekDayVal;

    Weekdays(Integer weekDayVal) {
        this.weekDayVal = weekDayVal;
    }

    public Integer getWeekDayVal() {
        return this.weekDayVal;
    }
}
public class WeekDay {
    public static void main(String[] args) {
        Arrays.asList(Weekdays.MONDAY,Weekdays.SATURDAY,Weekdays.THURSDAY,Weekdays.SUNDAY)
                .stream().sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
