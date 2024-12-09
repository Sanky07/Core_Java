package GMT_Assignments;

/*i)Find the index of a character 'c' in a given string.
String a1 = "Welcome India"

ii)Retrieve the character at index '4'in a given string.
String str = "Programming "

iii)Concatenate two strings.
    String str1 = "Hello,"
    String str2 = "World"
        
iv)Extract a substring from the index '11' to the end of the string.
String name = "Welcome to Java Programming"

v)Extract a substring from index 0 to 11
String P1 = "Programming is fun"*/

public class Assignment_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a1= "Welcome India";
		System.out.println(a1.indexOf('c')); //index of char 'c'
		
		String a2="programming";
		System.out.println(a2.charAt(4)); //character at index 4
		
		String str1="Hello";
		String str2="World";
		
		String str3=str1.concat(str2); //concatination of String
		System.out.println(str3);
		
		String str4="Welcome to Java Programming";
		System.out.println(str4.substring(11, 27)); //substring from the index '11' to the end of the string.

		String str5="Programming is fun";
		System.out.println(str5.substring(0, 11)); //substring from index 0 to 11

	}

}
