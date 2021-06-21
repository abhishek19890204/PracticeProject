package Com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	@Test(invocationTimeOut=2)
	public void infiniteLooptest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() 
	{
		String a = "100A";
		Integer.parseInt(a);
		
	}

}
