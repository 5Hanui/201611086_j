package com.sd.game;

public class Player{
	protected String name=null;
	public Player(String _name){
		this.name=_name;

	}
	public void play(Game g){
		if g.equals(d){
			Dice d=new Dice();
			d.roll();
			num=d.getNum();
		}
		else{
			Yut y=new Yut();
			y.roll();
			num=y.getNum();
		}

	}
	public String getName(){
		return this.name;
	}
	public int getNum(){
		return this.num;
	}
}