package com.sd.ch8;
public abstract class Shape04{
	public String name="Shape";
	public abstract double calcArea();
	public abstract double calcPerimeter();
	public String getName(){
		return this.name;
	}
	public String toString(){
		return "Shape..."+super.toString();
	}
	public static void main(String[] args){
		Rectangle04 r=new Rectangle04(3,4);
		Circle04 c=new Circle04(5);
		System.out.println("Reactagle size is "+r.calcArea());
		System.out.println("Cicle size is "+c.calcArea());
		


	}
}