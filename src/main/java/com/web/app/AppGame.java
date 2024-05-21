package com.web.app;

import com.web.app.games.Mario;
import com.web.app.games.Pacman;

public class AppGame {
    
    public static void main(String args[]){

        var marioGame = new Mario();
        //var pacManGame = new Pacman();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
