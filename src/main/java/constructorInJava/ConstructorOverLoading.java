package constructorInJava;

public class ConstructorOverLoading {
	//only student id is required
	//other field is optional
			//id and last name
			//id and phone
			//id, last name and phone
	
	/*
	 * what is constructor overloading
	 * Different constructor signature(name + parameter)
	 */
			
	
	
	int studentId;
	int phone;
	String lasttName;
	static String schoolName="TEP";
	
	
	
	public ConstructorOverLoading(int studentId) {
		super();
		this.studentId = studentId;
		System.out.println("student id is "+studentId);
		System.out.println("manadatory constructor");
	
	}


	public ConstructorOverLoading(int studentId, int phone) {
		super();
		this.studentId = studentId;
		this.phone = phone;
		
		System.out.println("student id is "+studentId);
		System.out.println("student phone is "+phone);
		System.out.println("two arguments constructor");
		
	}
	
	
	public ConstructorOverLoading(int studentId, int phone, String lasttName) {
		super();
		this.studentId = studentId;
		this.phone = phone;
		this.lasttName = lasttName;
		
		System.out.println("student id is "+studentId);
		System.out.println("student phone is "+phone);
		System.out.println("student lasttName is "+lasttName);
		System.out.println("three arguments constructor");
		
	}





	public static void main(String[] args) {
		
		ConstructorOverLoading zahid = new ConstructorOverLoading(1);
		zahid.studentGrade('A');

		ConstructorOverLoading sharmin = new ConstructorOverLoading(2, 366363);
		sharmin.studentGrade('C');

		ConstructorOverLoading rozina = new ConstructorOverLoading(2, 366363, "Rozina");
		rozina.studentGrade('B');


	}
	
	
	
	public void studentGrade(char grade) {
		System.out.println("school name "+ schoolName+" grade "+grade);
		System.out.println();
	}

}
