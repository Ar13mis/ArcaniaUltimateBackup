package com.arcanereality.heathcliff;

import com.arcanereality.heathcliff.Character.Movement.MyMovement;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Arcania implements ApplicationListener {
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private MyMovement mymovement;

	@Override
	public void create() {
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("kiddo.png"));
		sprite = new Sprite(texture);
		mymovement = new MyMovement();

		sprite.scale(1.5f);
		sprite.setPosition(0, 0);

	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		mymovement.MyMovement(sprite);

		batch.begin();
		sprite.draw(batch);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}