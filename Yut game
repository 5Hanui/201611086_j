package com.sd.game;

public class Yutgame extends RollGame{
	protected String p;
	protected int number;
	public int newNum;
	public int play(){
		for(int i=0;i<3;i++){
			super.roll();
			if (super.getNum()==1){
				p="do";
				newNum=1;

			}else if(super.getNum()==2){
				p="gae";
				newNum=2;
			}else if(super.getNum()==3){
				p="gul";
				newNum=3;
			}else if(super.getNum()==4){
				p="yut";
				newNum=4;
			}else if(super.getNum()==5){
				p="mo";
				newNum=5;
			}else{
				p="back do";
				newNum=6;
			}
		}
		return newNum;

	}
	// public int getNum(){
	// 	return 
	// }
	public void yutplay(){
		
		play();
		System.out.println(newNum+" : "+p);

	}
}
