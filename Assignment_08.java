package GMT_Assignments;

//Write a program on method overloading static methods

public class Assignment_08 {
	
	static void overload() // static method overloading 01
	{  
		System.out.println("This is a static method");
	}
	
	static void overload(int n) // static method overloading 02
	{
		System.out.println("This is a static method "+n);
	}
	
	static void overload(String s) // static method overloading 03
	{
		System.out.println("This is a static method "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overload();
		overload(1);
		overload("SoftwareTesing");

	}

}
