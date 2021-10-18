package week3.day1;

public class Assignment5 {

	public static void main(String[] args) {


		String str3 = new String("Kutty");
		   String str4 = new String("Kutty");
		   
		   if(str3==(str4)) {
		    System.out.println("Same text");
		   }
		   else
		    System.out.println("Diff text");
		   
		   System.out.println("*****");
		   
		   /*
		    == is an operator so it will only compare 2 objects with reference to their location in memory. Meaning, it will check if both 
		    objects are at the exact same memory location or not. Thats why both the strings even though their spelling and case sensitivity is 
		    exactly the same, the == operator is not comparing the contents of the string but only the object location. Hence the output will 
		    return as not same/diff text. If you want to compare the contents of the string, we need to use .equals() method. That will compare the
		    string contents.
		    
		    if(str3.equals(str4)) {
		    System.out.println("Same text");
		   }
		   else
		    System.out.println("Diff text");
		    
		    
		    Here output will be "same text".
		    */

	}

}
