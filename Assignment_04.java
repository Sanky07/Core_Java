package GMT_Assignments;

import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if else if - grading system consiidering the marks A+: 90-100 , A: 80-90, B: 70-80, C: 60-70, D: 50-60, less than 50 marks is FAIL
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks obtained");
		int marks=sc.nextInt();
		
		if(marks>90 && marks<100) {
			System.out.println("A+ Grade");
		}
		else if(marks>80 && marks<90) {
			System.out.println("A Grade");
		}
		else if(marks>70 && marks<80) {
			System.out.println("B Grade");
		}
		else if(marks>60 && marks<70) {
			System.out.println("C Grade");
		}
		else if(marks>50 && marks<60) {
			System.out.println("D Grade");
		}
		else if(marks<50) {
			System.out.println("FAIL");
		}
		else {
			System.out.println("Invalid marks");
		}
			

	}

}
