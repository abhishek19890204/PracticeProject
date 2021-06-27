package simpleJavaprograms;

public class HSBCBank implements USBank, BrazilBank { // we are achieving multiple inheritance
	//Is- a relationship
	// IF a class implementing any interface , then its mandatory to define/override all the methods of Interface.
	//overriding from USbank
	public void Credit()
	{
		System.out.println("HSBC---Bank");
	}
	
	public void debit() 
	{
		System.out.println("HSBC---debit");
	}
	
	public void transferMoney() 
	{
		System.out.println("HSBC---transferMoney");
	}

	//separate method from HSBC bank
	public void EducationLoan()
	{
		System.out.println("HSBC---Edu Loan");
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC---Car Loan");
	}
	
	//Brazil bank method
	public void mutualFund()
	{
		
	}
}
