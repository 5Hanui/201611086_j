import java.util.ArrayList;
import java.util.Collections;

class Student{
	
	private String name;
	private int studentNum;
	Student(String name,int sNum){
		this.name=name;
		this.studentNum=sNum;
	}
	public String getName(){
		return name;
	}
	public static void main(String[] args){
		ArrayList<String> studentNameList=new ArrayList<String>();
		Student s1=new Student("ohn",201611086);
		Student s3=new Student("pjy",201611074);
		Student s2=new Student("khw",201611068);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);

	}
}