package com.bomber;


public class BomberDesktop {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//new LwjglApplication(new Game(), "Bomber", 800, 480, false);
		//new LwjglApplication(new GameScreen(), "Bomber", 480, 320, false);

		new GameServer().start();
		new GameClient().start();
	}
}
