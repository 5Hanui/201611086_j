package com.sd.ch8;
// import com.sd.ch8.*;
public class Point{
	private int x;
	private int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	

	public static void main(String[] args){
		
		Circle myCircle=new Circle(10,10,5);
		Double myArea=myCircle.getArea();
		System.out.println(myArea);
	}
}