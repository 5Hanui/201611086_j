package com.sd.ch8;
// import com.sd.ch8.*;
public class Circle extends Point{
	protected double radius;
	protected double myArea;
	public Circle(int x,int y,double r){
		super(x,y);
		this.radius=r;

	}
	public double getArea(){

		double myArea=Math.PI*Math.pow(radius,2);
		return myArea;
	}

}