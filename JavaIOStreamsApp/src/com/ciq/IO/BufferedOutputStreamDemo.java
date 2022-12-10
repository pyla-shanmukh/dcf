package com.ciq.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		File file= new File("concept.txt");
		String[] concepts = {
				"The BufferedOutputStream class, "
				+ "java.io.BufferedOutputStream, "
				+ "is used to capture bytes written to the "
				+ "BufferedOutputStream in a buffer, and "
				+ "write the whole buffer in one batch to "
				+ "an underlying Java OutputStream for i"
				+ "increased performance. "
				+ "Buffering can spread up IO quite a bit, "
				+ "especially when writing data to disk access "
				+ "or network."
						
		};
		
		try(FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos=new BufferedOutputStream(fos)){
			
			for (String concept : concepts) {
			bos.write(concept.getBytes());
			System.out.println(concept);
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
