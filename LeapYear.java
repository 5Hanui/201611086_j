class LeapYear{
	int year;
	void leap(int year){
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.printf("%d is a leap year \n",year);
		}else{
			System.out.printf("%d is not a leap year \n",year);
		}
	}
	public static void main(String[] args){
		LeapYear l=new LeapYear();
		int[] years={1800,1900,1912,1984,1985,2000,2015,1825,1928,2031,1845,1947,2053,2099};
		for(int y:years){
			l.leap(y);

		}
	}
}