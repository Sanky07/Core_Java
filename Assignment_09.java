package GMT_Assignments;

//Write a program on method overloading non static methods

public class Assignment_09 {

		// TODO Auto-generated method stub
		
	
	    // Method to add two integers
		public void add(int a, int b) {
	        int sum = a + b;
	        System.out.println("Sum of two integers: " + sum);
	    }

	    // Method to add three integers
	    public void add(int a, int b, int c) {
	        int sum = a + b + c;
	        System.out.println("Sum of three integers: " + sum);
	    }

	    // Method to add two double values
	    public void add(double a, double b) {
	        double sum = a + b;
	        System.out.println("Sum of two doubles: " + sum);
	    }

	    public static void main(String[] args) {
	    	
	    	Assignment_09 calc = new Assignment_09();

	        // Calling the add method with two integers
	        calc.add(5, 10);

	        // Calling the add method with three integers
	        calc.add(5, 10, 15);

	        // Calling the add method with two doubles
	        calc.add(5.5, 10.5);

	}

}
