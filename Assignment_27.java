package GMT_Assignments;

/*i)Write a program to check if a given string is a palindrome.
 String dr1= "rotator"
 
 ii)Check if two strings are equal
        String s1 = "Java"
        String s2 = "java"
                
iii)display the trimmed string from the original string "  A very Good Morning !  "*/

public class Assignment_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Palindrome Program
		
		String str1="rotator";
		String str_rev="";
		
		for(int i=str1.length()-1;i>=0;i--)   
		{
			str_rev=str_rev+str1.charAt(i);
		}
		//System.out.println(str_rev);
		if(str1.equals(str_rev))
		{
			System.out.println("Given string is Palindrome");
		}
		
		else {
			System.out.println("Given string is not a palindrome");
		}
		
		String s1="Java";String s2="java";
		
		// Compare two Strings
		
		if(s1.equals(s2)) { 
			System.out.println("\nString "+s1+" and "+s2+" are equal ");
		}
		else {
			System.out.println("\nString "+s1+" and "+s2+" are NOT equal ");
		}
		
		//Trim the extra space in the given string
		
		String s3="  A very Good Morning !  ";
		System.out.println("\n"+s3.trim());  
	
	}

}
