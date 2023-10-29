package dataTypeInJava;

public class WholeNumberDataType {
	/*
	 * queen gave me $20
	 * buy groceries apple cookies, milk
	 */

	public static void main(String[] args) {
		
		WholeNumberDataType wndt=new WholeNumberDataType();
		wndt.groceries();
		wndt.stationary();
		
	}

	public void groceries() {
		byte apple=5;
		short cookies=4;
		int milk=6;				
		long total=apple+cookies+milk;	
		System.out.println(total);
		int sheGaveMe=20;
		long moneyBack=sheGaveMe-total;
		System.out.println(moneyBack);
		//byte, short, int, long ==default value is 0
	}
	/*
	 * buy 5 note books
	 * buy 6 pencils
	 * average them
	 */
	public void stationary() {
		float noteBook=5.99f;
		float spentOnNoteBook=noteBook*5;
		System.out.println(spentOnNoteBook);
		double pencils=4.33;
		double spentOnPencil=pencils*6;
		System.out.println(spentOnPencil);
		
		double spentTotal=spentOnNoteBook+spentOnPencil;
		
		double averagePrice=spentTotal/11;
		System.out.println(averagePrice);
		//double and float =default value is 0.0
	}
	
	
	
}
