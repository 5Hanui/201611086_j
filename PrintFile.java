package com.sd.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class PrintFile{

	public static void main(String[] args) throws IOException{
		try{

			File f=new File("noname.txt");
			FileReader fr=new FileReader(f);
			fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Cannot find file");
		}
	}
}