package GMT_Assignments;

import java.util.Scanner;

public class Assignment_13_switch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of the day you want to print: ");
		int day=sc.nextInt();
		
		switch(day) {
		case 1: System.out.println("Monday");
		break;
		
		case 2: System.out.println("Tuesday");
		break;
		
		case 3: System.out.println("Wednesday");
		break;
		
		case 4: System.out.println("Thursday");
		break;
		
		case 5: System.out.println("Friday");
		break;
		
		case 6: System.out.println("Saturday");
		break;
		
		case 7: System.out.println("Sunday");
		break;
		
		default: System.out.println("You have entered invalid day number");
		}

	}
}
