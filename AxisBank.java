package week3.day1;

public class AxisBank {
	
	public void deposit()
	{
		System.out.println("Deposit is 1000");
	}

	public static void main(String[] args) {
		
		BankInfo bank=new BankInfo();
		bank.deposit();        
		
		/*Axis bank deposit is 1000 and bankinfo deposit is 500. Even though we are executing method inside 
		 AxisBank class, 500 is displayed in output instead of 1000 because child class method overrides
		 the parent class deposit() */

	}

}
