package org.example.annotationConfig.service;

import org.example.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component("classicService")
public class ClassicService {

    private List<Song> classicPlaylist = new ArrayList<>();

    @PostConstruct
    public void init() {
        Song song1 = new Song();
        song1.setName("Winter");
        song1.setAuthor("Antonio Vivaldi");

        Song song2 = new Song();
        song2.setName("Symphony 40");
        song2.setAuthor("Amadeus Mozart");

        classicPlaylist.add(song1);
        classicPlaylist.add(song2);
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