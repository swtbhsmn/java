package com.web.app.games;
import com.web.app.models.GameConsole;

public class Mario implements GameConsole {
    public void up(){
        System.out.println("Mario Up");
    }
    public void  down(){
        System.out.println("Mario Down");
    }
    public void left(){
        System.out.println("Mario Left");
    }
    public void right(){
        System.out.println("Mario Right");
    }
}
