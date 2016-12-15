package com.sd.game;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReportFile{
	String str;
	public void rewrite(String str) {
		try{
			FileWriter file=new FileWriter("c:/txt/result.txt");
			BufferedWriter bf=new BufferedWriter(file);
			bf.write(str);
			bf.close();
		}
	
		catch(FileNotFoundException e){
			System.out.println("Cannot find file!");
		}
		catch(IOException e){
			System.out.println("Error!");
		}
	}
}