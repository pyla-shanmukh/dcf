package com.ciq.IO;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File FILE_HANDLING_PATH = new File("src/com/ciq/IO");

//		@SuppressWarnings("unused")
		File file = new File(FILE_HANDLING_PATH + "EmployeeTest.java");

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.getFreeSpace());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.exists());

		File makeDir = new File("src//logs//IO//test.txt");
		System.out.println(makeDir.mkdirs());
		
		
		if(makeDir.exists()) {
			makeDir.renameTo(new File("src//logs//IO//tests"));
			System.out.println("renaming a file");
		}
		
		if (makeDir.delete()) {
			System.out.println("deleted a file");

		}

	}
}