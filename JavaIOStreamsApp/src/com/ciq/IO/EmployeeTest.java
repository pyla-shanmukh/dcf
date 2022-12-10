package com.ciq.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "mahesh", 20000.00);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("employee.txt");
			byte[] bytes = e1.toString().getBytes();
			fos.write(bytes);
			System.out.println("success");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}