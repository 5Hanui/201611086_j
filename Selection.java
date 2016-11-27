package com.sd.ch8;
import java.util.ArrayList;
public class Selection{
	ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
	public Selection(){}
	public void select(Rectangle r){
		r.setSelected(true);
		sArr.add(r);
		System.out.println("selected "+r.getSelected());
	}
	public void print(){
		for(Rectangle r:sArr)
			System.out.println(r.toString());
	}
	public static void main(String[] args){
		Selection s=new Selection();
		Rectangle r=new Rectangle(10.0,20.0);
		Cube c=new Cube(10.0,20.0,30.0);
		s.select(r);
		s.select(c);
		s.print();

	}


} 