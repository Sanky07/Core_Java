package GMT_Assignments;

//Create an employee class and demonstrate the constructor overloading types by providing the different parameters like, employee name,employee_id,employee_company,designation,salary.


public class Assignment_06_employee {
	
	Assignment_06_employee() //Default Constructor
	{
		System.out.println("Employee Details:"+"\n===========================");
	}
	
	Assignment_06_employee(String name,int id) // Constructor overloading with two parameters
	{
		
		System.out.println("Employee_Name: "+name+"\nEmp_id: "+id);
	}
	
	Assignment_06_employee(String company,String desgn,int sal) // Constructor overloading with three parameters
	{
		
		System.out.println("Company: "+company+"\nDesignation: "+desgn+"\nSalary: "+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_06_employee emp1=new Assignment_06_employee(); 
		Assignment_06_employee emp2=new Assignment_06_employee("Raju",707);
		Assignment_06_employee emp3=new Assignment_06_employee("Google","QA Engineer",90000);
		
	}

}
