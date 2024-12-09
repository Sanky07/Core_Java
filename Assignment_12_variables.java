package GMT_Assignments;

// Write a program to show the usage of Local, Global and Final variables


public class Assignment_12_variables {
	public static int g_num=77; //global variable
	
	final double pie=3.144; //final variable
	
	void l_variable()
	{
		int a=5;  //local variables
		int b=2;
		System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
	}
	
	void area_crcl() {
		int r=5;
		System.out.println("Area of a circle for the radius "+r+ " = "+(pie*r*r));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Value of global variable:"+g_num);
		Assignment_12_variables ob1= new Assignment_12_variables();
		
		ob1.l_variable();
		ob1.area_crcl();
		

	}

}
