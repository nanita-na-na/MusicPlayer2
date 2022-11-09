package org.example.annotationConfig;

import org.example.annotationConfig.service.ClassicService;
import org.example.annotationConfig.service.RockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    ClassicService classicService;
    RockService rockService;

    @Autowired
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
