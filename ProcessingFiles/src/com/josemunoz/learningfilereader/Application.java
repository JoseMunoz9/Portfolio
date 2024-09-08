package com.josemunoz.learningfilereader;
// import java.io.*; > Instead of importing every single file, we can use 'java.io.*'
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.tex");
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.getName());
			}
		}
	}

}
