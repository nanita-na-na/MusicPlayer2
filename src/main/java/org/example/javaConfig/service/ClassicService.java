package org.example.javaConfig.service;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class ClassicService {
    private List<Song> classicPlaylist;

    public ClassicService(List<Song> classicPlaylist) {
        this.classicPlaylist = classicPlaylist;
    }

    public void playClassicMusic() {
        System.out.println("Playing: " + classicPlaylist.get(0));
        System.out.println("1. Next\n0. Exit");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Plaing: " + classicPlaylist.get(1));
            } else if (choice == 0) {
                System.exit(0);
            } else {
                System.out.println("Wrong point! Input 1 or 0");
            }
        } else {
            System.out.println("You must input int value 1 or 2");
            playClassicMusic();
        }
        scanner.close();
    }
}