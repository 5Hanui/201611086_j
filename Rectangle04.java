package com.sd.ch8;
public class Rectangle04 extends Shape04{
	private final double width;
	private final double height;
	private final double area;
	private final double perimeter;
	public Rectangle04(double width,double height){
		this.width=width;
		this.height=height;
		this.area=width*height;
		this.perimeter=2*(width+height);
	}
	public double calcArea(){
		return this.area;
	}
	public double calcPerimeter(){
		return this.perimeter;
	}
	public String toString(){
		return "Rectangle..."+super.toString();
	}
}