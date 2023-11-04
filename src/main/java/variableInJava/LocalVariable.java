package variableInJava;

public class LocalVariable {

	public static void main(String[] args) {
		
		LocalVariable lv = new LocalVariable();
	             lv.faruq();
	             lv.tania();
	             lv.sadia();
	}
	
	
	public void faruq() {
		
		String firstName="Faruq";
		System.out.println(firstName);
		//String =data type
		//firstName= variable name
		//= is operator
		//"Faruq"= value/ initialization/assignment
	}
  
	public void tania() {
	final  String firstName="Tania";
	  System.out.println(firstName);
  }
	
  
	public void sadia() {
	  String firstName="Sadia";
	  System.out.println(firstName);
  }
	
	
}
