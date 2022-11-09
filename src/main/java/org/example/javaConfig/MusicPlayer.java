package org.example.javaConfig;

import org.example.javaConfig.service.ClassicService;
import org.example.javaConfig.service.RockService;

public class MusicPlayer {

    ClassicService classicService;
    RockService rockService;

    public MusicPlayer(ClassicService classicService, RockService rockService) {
        this.classicService = classicService;
        this.rockService = rockService;
    }

    public void playClassicMusic() {
        classicService.playClassicMusic();
    }

    public void playRockMusic() {
        rockService.playRockMusic();
    }
}
