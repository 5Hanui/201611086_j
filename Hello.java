package com.sd.ch8;
class Hello{
	private String name;
	public Hello(String name){
		this.name=name;
	}
	public void sayHello(){
		System.out.println("hello "+name);
	}
	public static void main(String[] args){
		Hello[] h=new Hello[5];
		h[0]=new Hello("ohn");
		h[1]=new Hello("ohn1");
		h[2]=new Hello("ohn2");
		h[3]=new Hello("ohn3");
		h[4]=new Hello("ohn4");
		for(int i=0;i<h.length;i++){
			h[i].sayHello();
		}
	}

}