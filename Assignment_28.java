package GMT_Assignments;

import java.util.Arrays;

/*Write a Java program to create and display an array of boolean and double data types. 
Initialize the arrays with some sample values and display them in array form.*/

public class Assignment_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ar1[]=new boolean[3];
		
		ar1[0]=true;
		ar1[1]=false;
		ar1[2]=true;
		
		System.out.println("boolean Type Array elements: "+Arrays.toString(ar1));

		
		double dr[]=new double[5];
		
		dr[0]=1.4;
		dr[1]=1.9;
		dr[2]=5.4;
		dr[3]=8.6;
		dr[4]=9.3;
		
		System.out.println("\ndouble Type Array elements: "+Arrays.toString(dr));
		
	}

}
