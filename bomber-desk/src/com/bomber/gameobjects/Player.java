package com.bomber.gameobjects;

import com.bomber.common.ObjectsPool;
import com.bomber.gameobjects.bonus.Bonus;
import com.bomber.world.GameWorld;

public class Player extends KillableObject {
	public short mPointsMultiplier = 1;
	public int mPoints = 0;
	public String mPointsAsString;
	public boolean mIsShieldActive = false;
	public short mLives = 1;
	public short mBombExplosionSize = 3;
	public short mMaxSimultaneousBombs = 1;
	public boolean mIsAbleToPushBombs = false;
	public short mSpeedFactor = 1;
	/**
	 * Inicializado com o m�ximo de bonus que podem estar activos ao mesmo
	 * tempo, 3.
	 */
	public ObjectsPool<Bonus> mActiveBonus;
	public String mName;
	/**
	 * Efeitos que devem ser desenhados por cima do jogador, bonus e splash da
	 * �gua...
	 */
	public ObjectsPool<Drawable> mEffects;
	public GameWorld mWorld;
	
	@Override
	public void update()
	{
		super.update();
		
		if(mIsDead)
		{
			// TODO: Verificar se chegou ao ultimo frame da anima��o
			// e se sim remover-se da lista
			mWorld.mPlayers.releaseObject(this);
		}
	}
	
	/**
	 * � utilizado pela ObjectPool quando o objecto � marcado como disponivel.
	 * Este m�todo deve ser sempre chamar o seu super antes/depois de efectuar
	 * mudan�as numa classe derivada
	 * 
	 * mIsBeingDestroyed = false;
	 */
	public void reset()
	{
		throw new UnsupportedOperationException();
	}

	public String getPoints()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	protected void onMove()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onKill()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onChangedDirection()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onStop()
	{
		// TODO Auto-generated method stub
		
	}
}