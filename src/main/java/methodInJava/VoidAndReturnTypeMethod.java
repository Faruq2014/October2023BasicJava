package methodInJava;

public class VoidAndReturnTypeMethod {

	public static void main(String[] args) {
		
		VoidAndReturnTypeMethod vartm= new VoidAndReturnTypeMethod();
		vartm.fullName();
		
		
		String uc=vartm.fullName1().toUpperCase();
		System.out.println(uc);
	}
	
	
	public void fullName() {
		String firstName="Tania";
		String lastName="Khan";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		
	}

	
	public String fullName1() {
		String fristName="Tania";
		String lastName="Khan";
		String fullName=fristName+" "+lastName;
		//System.out.println(fullName);
		return fullName;
		
		
	}
}
