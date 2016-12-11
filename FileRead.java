package com.sd.io;
import java.util.Scanner;
import java.io.*;

public class FileRead{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("/Users/test.txt");
		BufferedReader br= new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		fr.close();
	}
}