package GMT_Assignments;

//Write a program that demonstrates MultiLevel Inheritance using 3 Static and 2 Non static methods
class parent1{

	static void print1() {
		System.out.println("Static method from Parent 1 class");
	}
	
	void print() {
		System.out.println("Non-static method from Parent 1 class");
	}
}

class parent2 extends parent1{
	static void print2() {
		System.out.println("Static method from Parent 2 class");
	}
	void print_() {
		System.out.println("Non-static method from Parent 1 class");
	}
}

public class Assignment_17 extends parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_17 ob1= new Assignment_17();
		
		print1(); //class 1 static method
		print2(); // class 2 static method
		
		ob1.print(); //class 1 non-static method
		ob1.print_();//class 2 non-static method

	}

}
