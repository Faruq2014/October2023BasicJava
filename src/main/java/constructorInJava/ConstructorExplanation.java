package constructorInJava;

public class ConstructorExplanation {
	/*WE have 
	 *   4 variable
	 *     3 instance 
	 *     1 static
	 *     
	 *  we have 2 methods
	 *    1 instance
	 *    1 static
	 * 
	 */
	
	/*
	 * what is constructor
	 *   constructor is a especial method
	 *   constructor has same name as class name
	 *   constructor has no return type 
	 *   but it does not say void in the declaration
	 *   there are two types of constructor
	 *      default--automatically provided by the JVM
	 *      user define
	 *   
	 */
	
	/*
	 * what constructor does
	 * constructor instantiate instance properties
	 * instantiate==
	 * 
	 * 
	 * instance properties
	 *    instance variable
	 *    instance method
	 *    instance block
	 *    
	 *    
	 *    constructor can not called
	 *    constructor can be invoked
	 */
	
	
	int studentId;
	int phone;
	String firstName;
	static String lastName="Molla";
	
	

	public static void main(String[] args) {
	
		schoolName();
		System.out.println(lastName);
		
		ConstructorExplanation ce=  new ConstructorExplanation(); //default constructor
		
		ce.studentGrade();
		
	}
	
	
	
	

	public void studentGrade() {
		System.out.println(studentId=1);
		System.out.println(phone=111222);
		System.out.println(firstName="Faruq");
	}
	
	public static void schoolName() {
		System.out.println(lastName);
	}
	

}
