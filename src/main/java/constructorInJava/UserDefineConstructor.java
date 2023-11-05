package constructorInJava;

public class UserDefineConstructor {
	/*
	 * what is user define constructor
	 * user define won constructor based on needs
	 * as soon as user define constructor is available
	 * default constructor is not provided. 
	 */
	
	//student id and last name is mandatory
	
	int studentId;
	int phone;
	String lasttName;
	static String schoolName="TEP";
	

	

//student id and last name mandatory
	public UserDefineConstructor(int studentId, String lasttName) {
		super();
		this.studentId = studentId;
		this.lasttName = lasttName;
		System.out.println(studentId+" "+lasttName);
	}


	public static void main(String[] args) {
		UserDefineConstructor sadia= new UserDefineConstructor(1, "Sadia");
		sadia.studentGrade();
		UserDefineConstructor tania= new UserDefineConstructor(2, "Tania");
		tania.studentGrade();
	}
	
	
	public void studentGrade() {
		char grade='A';
		phone=23444;
		System.out.println(grade+" "+phone );
	
	}
	
	public static void schoolName() {
		
	}

}
