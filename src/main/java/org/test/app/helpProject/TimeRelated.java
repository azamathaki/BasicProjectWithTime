package org.test.app.helpProject;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TimeRelated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime startTime = LocalDateTime.now();

        int seconds = 5;
        System.out.println("If you are a dev then there is something for you...");

        System.out.println("Can you wait sometime to run and make ready this project? If yes just shut up and wait 5 seconds!");

        while (true){
            LocalDateTime currentTime = LocalDateTime.now();
            Duration leftTime = Duration.between(startTime, currentTime);

            if (leftTime.getSeconds() > seconds){
                System.out.println("Anyway there is nothing here you are an idiot. Time's up!");
                break;
            }

            if (scanner.hasNextLine()){
                String input = scanner.nextLine();
                System.out.println("I know i know. Hold on an second !");
            }
        }
    }
}
