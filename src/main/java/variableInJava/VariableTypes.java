package variableInJava;

public class VariableTypes {
    //instance area
	//class scope
	
	String firstName;//in the instance area+in the whole class scope
	
	public static void main(String[] args) {
		VariableTypes vt= new VariableTypes();
		System.out.println(vt.firstName);
		
	}
	
	
	
	public void faruq() {
		//only inside the method
			double bankBalance=10599.999;
			firstName="faruq";
	}
	
	
	public void fabiha() {
		firstName="fabiha";
		
}

	
	

}
