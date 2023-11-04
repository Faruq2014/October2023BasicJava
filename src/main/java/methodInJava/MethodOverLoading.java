package methodInJava;

public class MethodOverLoading {
     //instance variable
	//String firstName ==must
	//String lastName==must
	//int studentID==must
	//int phone== optional
	//String email== optional
	
	
	public static void main(String[] args) {
		MethodOverLoading mol= new MethodOverLoading();
		
	     mol.studentInfo("Nurul");
	     mol.studentInfo("Faiza", "Molla");
	     mol.studentInfo(111110, "Molla");

	}
	
// same method name with different signature is called method over loading
	  //same method name
	 //different parameter
	//mix and match data types allow
	// as a results method signature must be different
	
	public void studentInfo(String firstName) {
		
		System.out.println(firstName);
	}
//studentInfo(String firstName)
	// studentInfo==method name
	//(String firstName)==one String argument parameter
	//studentInfo(String firstName)== method signature
	
	
	public void studentInfo(String firstName, String lastName) {
		
		System.out.println(firstName+" "+lastName);
	}
	
	//studentInfo(String firstName, String lastName)
		// studentInfo==method name
		//(String firstName, String lastName)==two String argument parameter
		//studentInfo(String firstName, String lastName)== method signature

	
	public void studentInfo(int studentID, String lastName) {
		
		System.out.println(studentID+" "+lastName);
	}
	
	
	//studentInfo(int studentID, String lastName)
			// studentInfo==method name
			//(int studentID, String lastName)==mix argument parameter
			//studentInfo(int studentID, String lastName)== method signature

	
	
}
