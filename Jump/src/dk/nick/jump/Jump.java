package dk.nick.jump;

import com.badlogic.gdx.Game;

import dk.nick.jump.Screens.SplashScreen;


public class Jump extends Game  {

	public static final String VERSION = "0.0.0";
	public static final String LOG = "Jump";
	
	
	@Override
	public void create() {		
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {		
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
