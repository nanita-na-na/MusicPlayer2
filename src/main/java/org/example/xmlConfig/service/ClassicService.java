package org.example.xmlConfig.service;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class ClassicService {
    private List<Song> classicTrack;

    public ClassicService() {
    }

    public ClassicService(List<Song> classicTrack) {
        this.classicTrack = classicTrack;
    }

    public void addSong(Song song) {
        classicTrack.add(song);
    }

    public void playClassicMusic() {

        System.out.println("Playing: " + classicTrack.get(0));
        System.out.println("1. Next\n0. Exit");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Plaing: " + classicTrack.get(1));
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
