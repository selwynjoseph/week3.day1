package org.system;

public class Desktop {

	public void desktopSize()
	{
		System.out.println("Desktop size is 21 inch");
	}
	
	

	public static void main(String[] args)
	{
		Computer c=new Computer();
		c.computerModel();
		
		Desktop d=new Desktop();
		d.desktopSize();
	}

}