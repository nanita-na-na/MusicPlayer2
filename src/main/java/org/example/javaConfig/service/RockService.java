package org.example.javaConfig.service;

import org.example.Song;

import java.util.List;
import java.util.Scanner;

public class RockService {
    private List<Song> rockPlaylist;

    public RockService(List<Song> rockPlaylist) {
        this.rockPlaylist = rockPlaylist;
    }

    public void playRockMusic() {

        System.out.println("Playing: " + rockPlaylist.get(0));
        System.out.println("1. Next\n0. Exit");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Plaing: " + rockPlaylist.get(1));
            } else if (choice == 0) {
                System.exit(0);
            } else {
                System.out.println("Wrong point! Input 1 or 0");
            }
        } else {
            System.out.println("You must input int value 1 or 2");
            playRockMusic();
        }
        scanner.close();
    }
}
