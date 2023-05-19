package com.shaliniUdemy.learnspringframework;

import com.shaliniUdemy.learnspringframework.game.GameRunner;
import com.shaliniUdemy.learnspringframework.game.GamingConsole;
import com.shaliniUdemy.learnspringframework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game()
    {
        var game= new PacMan();
        return game;
    }
}
