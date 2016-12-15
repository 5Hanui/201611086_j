package com.sd.game;

public class Dice extends RollGame{
	
	public int newNum=1;
	public int play(){
		for(int i=0;i<2;i++){

			super.roll();
			// System.out.println(super.getNum());
			newNum=number*newNum;

		}

		return newNum;
	}
	public int getNumb(){
		return this.newNum;
	}
	// public void play_(String p){
	// 	System.out.printf("Winner is %s!! -> score :%d\n",p,newNum);
	// }

}