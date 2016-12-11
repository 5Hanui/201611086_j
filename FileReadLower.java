package com.sd.io;
import java.io.*;

public class FileReadLower{
	public void file2Lower(String s){
		String lower=s.toLowerCase();
		System.out.println(lower);

	}
	public static void main(String[] args) throws Exception{
		FileReadLower f=new FileReadLower();
		try{
			FileReader fr=new FileReader("/Users/test.txt");
			BufferedReader br=new BufferedReader(fr);
			String s;
			while(( s=br.readLine())!=null){
				f.file2Lower(s);
			}
			fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("cannot find file");
		}


	}
}