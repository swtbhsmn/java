package com.web.app;

import com.web.app.games.Mario;
import com.web.app.games.Pacman;

public class GameRunner {

    //public Pacman game;
    public Mario game;

    public GameRunner(Mario game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
