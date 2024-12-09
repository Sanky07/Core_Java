package GMT_Assignments;

public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested if: Donate blood considering the metrics age and weight. the person age must be greater than 18 and weight must be greater than 55 in order to donate the blood 
		
		int age=19;
		int weight=53;
		
		if(age>18) {
			if(weight>55) {
				System.out.println("Eligible to donate the blood");
			}
			else {
				System.out.println("You are under weight to donate blood");
			}
		}
		else if(age<18) {
			System.out.println("You are under age to donate blood");
		}

	}

}
