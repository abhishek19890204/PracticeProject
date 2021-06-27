package simpleJavaprograms;

public class TESTClassForInterface {

	public static void main(String[] args) {
		
		System.out.println(USBank.Min_bal);
		HSBCBank HS = new HSBCBank();
		
		HS.CarLoan();
		HS.Credit();
		HS.debit();
		HS.EducationLoan();
		HS.transferMoney();
		
		
		//dynamic Polymorphism 
		//- child class object can be referred by parent Interface refrence varibale.
		
		USBank b = new HSBCBank();
		b.Credit();
		b.debit();
		b.transferMoney();
	}

}
