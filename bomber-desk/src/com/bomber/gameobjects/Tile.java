package com.bomber.gameobjects;

public class Tile extends Drawable {
	public static final short TILE_SIZE = 47;
	public static final short WALKABLE = 0;
	public static final short DESTROYABLE = 1;
	public static final short COLLIDABLE = 2;
	public static final short PORTAL = 3;


	public short mType;
	public int mPositionInArray;

	public Tile(short _type) {
		mType = _type;
	}

	/**
	 * M�todo chamado pela classe GameWorld quando ocorre uma explos�o
	 */
	public void explode()
	{
		if (mType != DESTROYABLE)
			return;

		// TODO: Actualizar a anima��o
	}
}