package com.ciq.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {
	
	public static void main(String[] args) {
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File("concept.txt")));
			int i=0;
			while ((i = inputStream.read()) != -1) {
				System.out.println((char)i);
	}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();


}
}
}