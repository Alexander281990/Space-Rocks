package com.space.alex.ivan;

public class SpaceGame extends BaseGame {

    public void create() {
        super.create();
        setActiveScreen(new LevelScreen());
    }
}
