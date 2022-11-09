package org.example.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.annotationConfig");

        System.out.println("Hello in MUSIC PLAYER! Please make your choice.\n1. Play rock music\n2. Play classic music");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
                musicPlayer.playRockMusic();
            } else if (choice == 2) {
                MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
                musicPlayer.playClassicMusic();
            } else {
                System.out.println("Wrong point!");
            }
        } else {
            System.out.println("You must input int value 1 or 2");
        }
        scanner.close();
    }
}
