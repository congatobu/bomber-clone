package com.bomber.gametypes;

import com.bomber.world.GameWorld;

public abstract class GameType {	
	
	public GameWorld mGameWorld = null;
	public boolean mNeedsPortal = false;
	
	public GameType() {
		mGameWorld = null;
	}
	
	/*
	 * Usado para verificar se pode spawnar portal.
	 */
	public abstract boolean isObjectiveAcomplished();

	/*
	 * Usado para verificar se pode mudar para o estado Win
	 */
	public abstract boolean isOver();
	public abstract boolean isLost();
	

	//TODO : apagar se nao for necessário
	public static final short CAMPAIGN = 0;
	public static final short CTF = 1;
	public static final short DEADMATCH = 2;
	public static final short TEAM_CTF = 3;
	public static final short TEAM_DEADMATCH = 4;
}