package GMT_Assignments;

/*Write a java program on String functions for the following :
Here, the String = " I Love MySelf"

a)Find the length of the given String.
b)Convert the String to upper case and lower case.
c)Remove all white spaces from String.
d)Reverse the given string using loops.*/

public class Assignment_25_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Selenium Testing";
		
		System.out.println("String Length: "+name.length());
		System.out.println("String To Upper : "+name.toUpperCase());
		System.out.println("String to Lower : "+name.toLowerCase());
		System.out.println("Removed whitespace in the String"+name.strip());
		
		String name_rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			name_rev=name_rev+name.charAt(i);
		}
		
		System.out.println("Reversed String = "+name_rev);

	}

}
