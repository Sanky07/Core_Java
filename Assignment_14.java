package GMT_Assignments;

public class Assignment_14 {
	
	//Write a program using 'continue' statement to skip printing any numbers from 100 to 200

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<=200;i++)
		{
			if(i<=104) //Prints the numbers from 105
			{  
				continue;
			}
			System.out.println(i);
		}
		
	}

}
