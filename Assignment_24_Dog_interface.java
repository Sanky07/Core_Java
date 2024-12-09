package GMT_Assignments;

interface Animal //Interface class
{
	
	void eat(); 
	void sleep(); 
	void sound();
}



public class Assignment_24_Dog_interface implements Animal //Interface class implementation
{


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Below are the characteristics of a Dog:\n");
		System.out.println("The Dog like to eat Meat");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleeps during day time");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks all day");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_24_Dog_interface ob1=new Assignment_24_Dog_interface();
		ob1.eat();
		ob1.sleep();
		ob1.sound();
		

	}

}
