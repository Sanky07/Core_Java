package GMT_Assignments;

/*Use 'Super' Keyword in the previous methodoverriding program, to access the superclass method in overridden methods
 */

// Assignment 21 and 22

public class Assignment_21_and_22_Student extends Assignment_21_User{
	void login()
	{
		super.login(); // calling parent class method implementation using super keyword
		System.out.println("Student Login");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_21_and_22_Student ob1=new Assignment_21_and_22_Student();
		
		ob1.login();

	}

}
