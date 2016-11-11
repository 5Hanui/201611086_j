import java.util.ArrayList;
class Numbers{
	static ArrayList<Integer> mylist=new ArrayList<Integer>();
	Numbers(){
		System.out.println("Data Structure-1 !!");
	}
	void setNumbers(ArrayList<Integer> mylist){
		for(int i=0;i<=1000;i++){
			if(i%4==0 && i%5!=0){
				mylist.add(i);
			}
		}
		System.out.println(mylist);
		
	}
	int sumList(ArrayList<Integer> mylist){
		int sum=0;
		int maxiter=mylist.size();
		for(int j=0;j<maxiter;j++){
			sum+=mylist.get(j);
			
		}
		return sum;
	}
	
	public static void main(String[] args){
		Numbers n=new Numbers();
		n.setNumbers(mylist);
		System.out.println("sum is "+n.sumList(mylist));
	}

}