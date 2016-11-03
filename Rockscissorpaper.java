class Rockscissorpaper{
	String sel1;
	String sel2;
	String error;
	String result;
	String rsp(String sel1,String sel2){
		if(sel1.equals("r")&&sel2.equals("s")){
			return result="sel1";
		}else if(sel1.equals("r")&&sel2.equals("p")){
			return result="sel2";
		}else if(sel1.equals("s")&&sel2.equals("r")){
			return result="sel2";
		}else if(sel1.equals("s")&&sel2.equals("p")){
			return result="sel1";
		}else if(sel1.equals("p")&&sel2.equals("r")){
			return result="sel1";
		}else if(sel1.equals("p")&&sel2.equals("s")){
			return result="sel2";
		}else if(sel1.equals("r")&&sel2.equals("r")){
			return result="draw";
		}else if(sel1.equals("s")&&sel2.equals("s")){
			return result="draw";
		}else if(sel1.equals("p")&&sel2.equals("p")){
			return result="draw";
		}
		else{
			return error;
		}

	}
	public static void main(String[] args){
		Rockscissorpaper r=new Rockscissorpaper();
		String[] game={"r","s","p"};
		for(String s1:game){
			for (String s2:game){
				if(s1.equals(s2)){
					System.out.printf("sel1 = %s  sel2 = %s ---> result is %s\n",s1,s2,r.rsp(s1,s2));
				}else{
					System.out.printf("sel1 = %s  sel2 = %s ---> winner is %s\n",s1,s2,r.rsp(s1,s2));
				}
			}
		}
		
	}
}