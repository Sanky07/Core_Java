package GMT_Assignments;

/*Write a program on 'super' statement to invoke a parent class constructor 
from 
a child class constructor.
Consider here the
Parent class is 'Vehicle'
and Child class is 'Car.' */


class vehicle{
	
	vehicle()
	{
		System.out.println("Vehicle constructor called");
		
	}
	
	vehicle(String s1,String s2)
	{
		System.out.println("Car segment = "+s1);
		System.out.println("Make = "+s2);
	}
}
public class Assignment_18 extends vehicle{
	
	String fuel=null;
	String mode=null;
	int year=0;
	
	Assignment_18(){
		System.out.println("defaul constructor called");	
	}
	
	Assignment_18(String segment,String fuel,String make,String model,int year){
		super(segment,make);
		System.out.println("Model = "+model);
		System.out.println("Fuel = "+fuel);
		System.out.println("Manufacturing Year = "+year);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_18 ob1=new Assignment_18();
		Assignment_18 ob2=new Assignment_18("SUV","Petrol","TATA","PUNCH",2023);

	}

}
