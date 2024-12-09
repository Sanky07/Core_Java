package GMT_Assignments;

import java.util.Scanner;

// Demonstrate the Scanner class usage by taking user inputs of a student like ID,Name,College,Branch,phone_no and print the same.

public class Assignment_11_Scanner {
	
	void show_student_details(int id,String name,String clg,String brn,long ph) {
		System.out.println("\n\nThe Student "+name+" Detials are:");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("College : "+clg);
		System.out.println("Branch : "+brn);
		System.out.println("Phone : "+ph);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter the student details in the format::  ID , Name , College , Branch , Phone_no:");
		int id=sc1.nextInt();
		String name=sc1.next();
		String clg=sc1.next();
		String brn=sc1.next();
		long ph=sc1.nextLong();
		
		Assignment_11_Scanner sc01 = new Assignment_11_Scanner();
		sc01.show_student_details(id,name,clg,brn,ph);
		
	
		

	}

}
