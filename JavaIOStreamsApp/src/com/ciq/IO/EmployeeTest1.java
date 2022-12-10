package com.ciq.IO;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EmployeeTest1 {
	
	

	public static void main(String[] args) throws IOException{
		Department dept= new Department(10, "HR", "HYD");
		Department dept2= new Department(20, "SE", "PUNE");
		FileOutputStream fos3= new FileOutputStream("dept.txt");
		
		FileOutputStream fos= new FileOutputStream("employee.txt");
		FileOutputStream fos2= new FileOutputStream("employee2.txt");
		BufferedOutputStream bos= new BufferedOutputStream(fos);
        BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(bos));
        
        Employee e1=  new Employee(100, "alexa", 125000.00,Gender.FEMALE);
        Employee e2=  new Employee(101, "JHON", 100000.00,Gender.MALE);
        
        System.out.println(e1);
        System.out.println(e2);
        
        Employee[] employees = { e1, e2};
        
        for (Employee employee : employees) {
        	bos.write(employee.toString().getBytes());
        	writer.write(employee.toString());
        	writer.newLine();
        	writer.flush();
        }

	}

}
