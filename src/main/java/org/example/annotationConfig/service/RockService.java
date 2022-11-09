package org.example.annotationConfig.service;

import org.example.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component("rockService")
public class RockService {
    List<Song> rockPlaylist = new ArrayList();

    @PostConstruct
    public void init() {
        Song song1 = new Song();
        song1.setName("Smells Like Teen Spirit");
        song1.setAuthor("Nirvana");

        Song song2 = new Song();
        song2.setName("We Will Rock You");
        song2.setAuthor("Queen");

        rockPlaylist.add(song1);
        rockPlaylist.add(song2);
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
