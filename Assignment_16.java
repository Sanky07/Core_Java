package GMT_Assignments;

//Write a program that demonstrate single-level inheritance.(where one class inherits from a single parent class)


class A{
	
	void print1() {
		System.out.println("Printing from the Parent Class");
	}
}


public class Assignment_16 extends A{
	
	void print2() {
		System.out.println("Printing from the Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_16 ob1 = new Assignment_16();
		ob1.print1();
		ob1.print2();

	}

}
