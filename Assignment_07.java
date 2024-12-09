package GMT_Assignments;

//Demonstrate the method overloading concept to perform the addition function of different data types input like int,double,string.

public class Assignment_07 {
	
	void addition(int n1,int n2) //method overloading 01
	{
		System.out.println("\nSum of integers "+n1+" and "+n2+" = "+(n1+n2));
	}
	
	void addition(double n1,double n2) //method overloading 02
	{
		System.out.println("\nSum of double type numbers "+n1+" and "+n2+" = "+(n1+n2));
	}
	
	void addition(String s1,String s2) //method overloading 03
	{
		System.out.println("\nAddition/Concatination of String "+s1+" and "+s2+" = "+s1.concat(s2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_07 A1=new Assignment_07();		
		
		A1.addition("Software", "Testing");
		A1.addition(7, 77);
		A1.addition(75.50, 25.67);

	}

}
