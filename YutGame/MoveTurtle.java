package com.sd.game;
import ch.aplu.turtle.*;

public class MoveTurtle{
	Turtle t1=new Turtle();
	public void point(double x,double y){
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
	}
	public void color(){
		t1.setColor("red");
	}
	public void stTurtle(){
		t1.fd(50);
	}
	public void bTurtle(){
		t1.back(25);
	}
	public double getPos(){
		return t1.getY();
	}
}