package com.arcanereality.heathcliff.Character.Movement;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by jacob6841 on 5/19/16.
 */
public class MyMovement{

    public Sprite MyMovement(Sprite sprite){
        MoveUp(sprite);
        MoveDown(sprite);
        MoveRight(sprite);
        MoveLeft(sprite);

        return sprite;
    }

    public Sprite MoveUp(Sprite sprite){
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            if(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Input.Keys.SHIFT_RIGHT))
                sprite.translateY(1f);
            else
                sprite.translateY(10f);
        }

        return sprite;
    }

    public Sprite MoveDown(Sprite sprite){
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            if(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Input.Keys.SHIFT_RIGHT))
                sprite.translateY(-1f);
            else
                sprite.translateY(-10f);
        }

        return sprite;
    }

    public Sprite MoveRight(Sprite sprite){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            if(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Input.Keys.SHIFT_RIGHT))
                sprite.translateX(1f);
            else
                sprite.translateX(10f);
        }

        return sprite;
    }

    public Sprite MoveLeft(Sprite sprite){
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            if(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Input.Keys.SHIFT_RIGHT))
                sprite.translateX(-1f);
            else
                sprite.translateX(-10f);
        }

        return sprite;
    }
}