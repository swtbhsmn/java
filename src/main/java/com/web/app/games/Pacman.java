package com.web.app.games;

import com.web.app.models.GameConsole;

public class Pacman implements GameConsole {
    public void up(){
        System.out.println("Up");
    }
    public void  down(){
        System.out.println("Down");
    }
    public void left(){
        System.out.println("Left");
    }
    public void right(){
        System.out.println("Right");
    }
}
