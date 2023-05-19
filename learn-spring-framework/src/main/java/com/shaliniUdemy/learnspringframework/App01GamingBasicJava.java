package com.shaliniUdemy.learnspringframework;

import com.shaliniUdemy.learnspringframework.game.GameRunner;
import com.shaliniUdemy.learnspringframework.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game=new MarioGame();
        //var game = new SuperContraGame();
        var game=new PacMan();
        var gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}
