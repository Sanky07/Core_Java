package GMT_Assignments;

import java.util.Arrays;

/*Write a progrm for the given strings, to check if the both arrays are equal to each other. 
here, String1: "kv no2 bangalore" and String2: "karnataka"*/

public class Assignment_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="kv no2 bangalore";
		String s2="Karnataka";
		
		char[] c1=s1.toCharArray();  //Converting String to Array
		char[] c2=s2.toCharArray();
		
		boolean res=Arrays.equals(c1, c2); //Checking whether the Arrays are equal
		
		if(res==true) {
		
		System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not Equal");
		}

	}

}
