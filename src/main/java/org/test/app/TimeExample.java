package org.test.app;

import java.time.LocalDateTime;

public class TimeExample {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime now = LocalDateTime.now();
        // be careful this 'now' variable record time when it is initialized

        int seconds = now.getSecond();
        int minutes = now.getMinute();
        int hours = now.getHour();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();

        System.out.println(hours);

        // this example is showing how recorded times differs from each other
        System.out.println(now.getSecond());
        Thread.sleep(4000);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2.getSecond());


    }
}
