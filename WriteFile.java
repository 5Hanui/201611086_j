package com.sd.io;

import java.io.*;
public class WriteFile{
	public static void main(String[] args) throws Exception{
		try{

			FileWriter file=new FileWriter("test.txt");
			BufferedWriter bf=new BufferedWriter(file);
			bf.write("buffer test");
			bf.close();
		}
		catch(FileNotFoundException e){
			System.out.println("error !!");



		}
	}
}