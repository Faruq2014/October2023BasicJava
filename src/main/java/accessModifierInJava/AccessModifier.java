package accessModifierInJava;

public class AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier am= new AccessModifier();
		am.logingCredential("hello", "hello123");
		am.studentTutionFee(500);
		am.subjuctName("Java");
		am.studentInfo("Zahid");
	}
	
	//private method only accessible to the same class
	private void logingCredential(String userName, String password) {
		System.out.println(userName+" "+password);
		System.out.println("private method");
		
		
	}
	
	// deafult method access able
	      // same class
	       // same package
	 void studentTutionFee(double subjectFee) {
		System.out.println(subjectFee);
		System.out.println("default method");
	}
	// protected method access able
     // same class
     // same package
	 // different package-->
	     //relationship with extends key word
	static  protected void subjuctName(String subject) {
		System.out.println(subject);
		System.out.println("protected method");
	}
	// public method access able
    // same class
    // same package
	 // different package
	public void studentInfo(String firstName) {
		System.out.println(firstName);
		System.out.println("public method");
	}
	
	

}
