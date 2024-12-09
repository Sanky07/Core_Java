package GMT_Assignments;

import java.util.Scanner;

/*Write a program 
that uses an
'assert'
statement to 
verify if an input 
age is within 
the range 0 to 65, 
and 
triggering an
'AssertionError'
if it is not. */

public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		
		int age=sc.nextInt();
		
		assert age<=65:"Age must be below 65";

	}
}
