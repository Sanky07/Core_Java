package GMT_Assignments;

/*Write a program to demonstrate 'Abstraction' using abstract class 'Student', which consists of 2 abstract methods and 2 concrete methods.
*/

abstract class student{
	
	abstract void student_details(); //abstract method_1 declaration
	abstract void study(); //abstract method_2 declaration
	
	void school_details() {
		System.out.println("This is a School_details method from abstract student class");
	}
	void student_schedule() {
		System.out.println("Student's activities has been scheduled for this week");
	}
	
}


public class Assignment_23_Student_abs extends student{

	@Override
	void student_details()  //abstract method 1 implementation
	{ 
		// TODO Auto-generated method stub
		System.out.println("Student Details:");
		System.out.println("Name: Test");
		System.out.println("School: KV");
		System.out.println("Class: 10th");
		
	}
	
	@Override
	void study()  //abstract method 2 implementation
	{
		// TODO Auto-generated method stub
		System.out.println("Student is studying");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_23_Student_abs s1=new Assignment_23_Student_abs();
		s1.school_details();
		s1.student_details();
		s1.study();
		s1.student_schedule();

	}


	

}
