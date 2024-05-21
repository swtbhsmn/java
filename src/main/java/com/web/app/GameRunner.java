package com.web.app;

import com.web.app.games.Mario;
import com.web.app.games.Pacman;
import com.web.app.models.GameConsole;

public class GameRunner {

    //public Pacman game;
    //public Mario game;

    public GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
