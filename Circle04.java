package com.sd.ch8;
public class Circle04 extends Shape04{
	private final double radius;
	private final double area;
	private final double perimeter;
	public Circle04(double radius){
		this.radius=radius;
		this.area=Math.PI*radius*radius;
		this.perimeter=2*Math.PI*radius;
	}
	public double calcArea(){
		return this.area;
	}
	public double calcPerimeter(){
		return this.perimeter;
	}
	public String toString(){
		return "Cicle..."+super.toString();
	}
}