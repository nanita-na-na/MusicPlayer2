package org.example.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfig1.xml");

        System.out.println("Hello in MUSIC PLAYER! Please make your choice.\n1. Play rock music\n2. Play classic music");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
                musicPlayer.playRockMusic();
            } else if (choice == 2) {
                MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
                musicPlayer.playClassicMusic();
            } else {
                System.out.println("Wrong point! Try again");
            }
        } else {
            System.out.println("You must input int value 1 or 2. Try again.");
        }
        scanner.close();
        context.close();
    }
}