package com.sd.game;
public class RollGame{
	protected int number;
	public RollGame(){}
	public void roll(){
		number=(int)(Math.random()*6)+1;

	}
	public int getNum(){
		return this.number;
	}
	public static void main(String[] args){
		RollGame r1=new Dice();
		RollGame r2=new Yutgame();
	}

}