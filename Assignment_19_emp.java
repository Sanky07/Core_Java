package GMT_Assignments;

/*Write a program 
on 'this' statement 
to perform 
the constructor chaining 
in the Employee class;
where Employee class
 have the parameters: 
employee name,
employee_id,
employee_company,
designation,
salary.  
 */

public class Assignment_19_emp {
	
	Assignment_19_emp()
	{
		
		System.out.println("Employee Details are :");
	}
	
	Assignment_19_emp(String enme,String e_id)
	{
		this(enme);
		System.out.println("Employee id = "+e_id);
	}
	
	Assignment_19_emp(String enme)
	{
		this();
		System.out.println("Employee name = "+enme);
	}
	Assignment_19_emp(String e_name,String e_id,String e_comp,String e_des,long e_sal){
		this(e_name,e_id);
		System.out.println("Company = "+e_comp);
		System.out.println("Designation = "+e_des);
		System.out.println("Salary = "+e_sal);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19_emp e1 = new Assignment_19_emp("Sanketh","7007","Google","SDET",95000);
		
		

	}

}
