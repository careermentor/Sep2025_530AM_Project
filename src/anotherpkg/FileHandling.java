package anotherpkg;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling
{

	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		
	}
	
	public static void readtextdata() throws Exception
	{
		//File f = new File("C:\\TestData\\data.txt");  //file connection
		//File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		BufferedReader br = new BufferedReader(fr);
		
		/*
		int r = fr.read();
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
		*/
	
		br.readLine();
		
		
	}
	
	public static void main(String[] args) throws Exception {
	
		readprop();
		
	}
	
	
}
