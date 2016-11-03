class Grade{
	String grade;
	String computeGrade(double score){
		
		if (90<=score && score<=100){
			return grade="A";
		}else if(80<=score && score<90){
			return grade="B";
		}else if(70<=score && score<80){
			return grade="C";
		}else if(60<=score && score<70){
			return grade="D";
		}else{
			return grade="F";
		}
	}
	public static void main(String[] args){
		Grade g=new Grade();
		double[] marks={91.5, 81.5, 71.5, 61.5, 51.5, 41.5};
		for (double m:marks){
			
			System.out.printf("You enterd marks grade %s\n",g.computeGrade(m));
		}

	}
}