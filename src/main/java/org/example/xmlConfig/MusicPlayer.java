package org.example.xmlConfig;

import org.example.xmlConfig.service.ClassicService;
import org.example.xmlConfig.service.RockService;

public class MusicPlayer {
    private ClassicService classicService;
    private RockService rockService;

    public MusicPlayer() {
    }

    public MusicPlayer(RockService rockService, ClassicService classicService) {
        this.rockService = rockService;
        this.classicService = classicService;
    }

    public void playClassicMusic() {
        classicService.playClassicMusic();
    }

    public void playRockMusic() {
        rockService.playRockMusic();
    }
}