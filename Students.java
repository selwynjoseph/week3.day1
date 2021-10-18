package week3.day1;

public class Students {
	
	
	public void getStudentInfo(int x)
	{
		System.out.println("Student id is " + x);
	}
	
	public void getStudentInfo(int x, String y)
	{
		//System.out.println("Student id is " + x);
		//System.out.println("Student name is " + y);
		System.out.println("Student id is " + x + "          Student name is " + y);
	}

	public void getStudentInfo(String x, int y)
	{
		//System.out.println("Student email is " + x);
		//System.out.println("Student phone number is " + y);
		System.out.println("Student email is " + x + "        Student phone number is " + y);
	}
	

	public static void main(String[] args) {

		Students s=new Students();
		
		s.getStudentInfo(122303);
		s.getStudentInfo(122303, "selwyn");
		s.getStudentInfo("selwyn@gmail.com", 1234567891);

	}

}



//x=122303; x=122303;
//y="selwyn";
//x="selwyn@gmail.com";
//y=1234567891;
