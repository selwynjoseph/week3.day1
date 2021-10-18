package week3.day1;

public class JavaExercise2 {

	public static void main(String[] args) {
		
		String str1="I am Learning Java";
		String str2="I am learning java"; 
		
		if(str1==str2)
		{
			System.out.println("Strings are same using == operator");
		}
		else
		{
			System.out.println("Strings are not same using == operator");
		}
		
		System.out.println("*****************************");
		
		if(str1.equals(str2))
		{
			System.out.println("Strings are same using equals method");
		}
		
		else
		{
			System.out.println("Strings are not same using equals method");
		}

		System.out.println("*****************************");
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Strings are same using equalsIgnoreCase method");
		}
		
		else
		{
			System.out.println("Strings are not same using equalsIgnoreCase method");
		}
	}

}
