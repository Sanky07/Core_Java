package GMT_Assignments;

public class Assignment_20_sub_cls01 extends Assignment_20_Hierar_cls{

	void dog()
	{
		System.out.println("This is a Dog");
	}
	
	void bark()
	{
		System.out.println("The Dog barks");
	}
	
	public static void main(String[] args) {
		
		Assignment_20_sub_cls01 ob1=new Assignment_20_sub_cls01();
		
		ob1.dog();
		ob1.eat(); // calling parent class method
		ob1.bark();
		ob1.sleep(); // calling parent class method
		
	}
	
}
