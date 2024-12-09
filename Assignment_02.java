package GMT_Assignments;

public class Assignment_02 {
	
	static void method1()
	{
		System.out.println("Static method 01 called");
	}
	
	static void method2()
	{
		System.out.println("Static method 02 called");
	}
	static  void method3()
	{
		System.out.println("Static method 03 called");
	}
	
	void method01()
	{
		System.out.println("\nNon-Static method 01 called");
	}
	
	void method02()
	{
		System.out.println("Non-Static method 02 called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static method call
		method1();
		method2();
		method3();
		
		//Assignment_02 A2=new Assignment_02();
		
		//Non-static method call
		new Assignment_02().method01();
		new Assignment_02().method02();
		

	}

}
