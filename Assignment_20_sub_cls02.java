package GMT_Assignments;

public class Assignment_20_sub_cls02 extends Assignment_20_Hierar_cls{

	void cat()
	{
		System.out.println("This is a Cat");
	}
	
	void meow()
	{
		System.out.println("The Cat Meows all the time");
	}
	
	public static void main(String[] args) {
		
		Assignment_20_sub_cls02 ob1=new Assignment_20_sub_cls02();
		
		ob1.cat();
		ob1.eat(); // calling parent class method
		ob1.meow();
		ob1.sleep(); // calling parent class method
		
	}
}
