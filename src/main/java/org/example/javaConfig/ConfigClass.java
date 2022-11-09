package org.example.javaConfig;

import org.example.Song;
import org.example.javaConfig.service.ClassicService;
import org.example.javaConfig.service.RockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example.javaConfig")
public class ConfigClass {

    @Bean
    public Song classicSong1() {

        Song classicSong1 = new Song();
        classicSong1.setName("Winter");
        classicSong1.setAuthor("Antonio Vivaldi");
        return classicSong1;
    }

    @Bean
    public Song classicSong2() {

        Song classicSong2 = new Song();
        classicSong2.setName("Symphony 40");
        classicSong2.setAuthor("Amadeus Mozart");
        return classicSong2;
    }

    @Bean
    public Song rockSong1() {

        Song rockSong1 = new Song();
        rockSong1.setName("Smells Like Teen Spirit");
        rockSong1.setAuthor("Nirvana");
        return rockSong1;
    }

    @Bean
    public Song rockSong2() {

        Song rockSong2 = new Song();
        rockSong2.setName("We Will Rock You");
        rockSong2.setAuthor("Queen");
        return rockSong2;
    }

    @Bean
    public List<Song> classicPlaylist() {
        return Arrays.asList(classicSong1(), classicSong2());
    }

    @Bean
    public List<Song> rockPlaylist() {
        return Arrays.asList(rockSong1(), rockSong2());
    }

    @Bean
    public ClassicService classicalService() {
        return new ClassicService(classicPlaylist());
    }

    @Bean
    public RockService rockMusicService() {
        return new RockService(rockPlaylist());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalService(), rockMusicService());
    }
}
