class Bmi{
	float height;
	float weight;
	float bmi;
	String result;
	String computeBMI(float height,float weight){
		bmi=weight/(height*height);
		if(bmi<18.5){
			return result="low";
		}else if(18.5<=bmi&&bmi<23){
			return result="normal";
		}else if(23<=bmi&&bmi<25){
			return result="risky";
		}else if(25<=bmi&&bmi<30){
			return result="obesity 1";
		}else if(30<=bmi&&bmi<40){
			return result="obesity 2";
		}else if(40<=bmi){
			return result="obesity 3";
		}else{
			return result="error";
		}

	}
	public static void main(String[] args){
		Bmi b=new Bmi();
		System.out.printf("your bmi is ...%s",b.computeBMI(1.65f,50));
	}
}