package com.space.alex.ivan;

import com.badlogic.gdx.Input;

public class LevelScreen extends BaseScreen {

    private Spaceship spaceship;

    @Override
    public void initialize() {
        BaseActor space = new BaseActor(0, 0, mainStage);
        space.loadTexture("space.png");
        space.setSize(800, 600);
        BaseActor.setWorldBounds(space);

        spaceship = new Spaceship(400, 300, mainStage);
    }

    @Override
    public void update(float dt) {

    }

    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.X)
            spaceship.warp();
        if (keycode == Input.Keys.SPACE)
            spaceship.shoot();

        return false;
    }
}
