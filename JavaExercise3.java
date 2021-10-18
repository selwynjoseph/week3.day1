package week3.day1;

public class JavaExercise3 {

	public static void main(String[] args) {
		
		String str="I am working with Java8";
		System.out.println(str);
		char[] ch=str.toCharArray();
		
		String str1=null;
		str1=str.replace("8", "11");
		System.out.println(str1);
		
		
		//print characters from 5 to 14
		for(int j=4; j<14;j++)
		{
			System.out.print(ch[j]);
		}


	}

}

/*
 //replace 8 with 11
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]==8)
			{
				ch[i]=11;
			}
		}
 */ 
