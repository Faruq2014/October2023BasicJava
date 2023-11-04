package methodInJava;

public class ExplainMethod {
	
	
    //main is a special method
	// execution starts from main method
	// it is always static 

	public static void main(String[] args) {
		
	}
	
	//public static void main(String[] args)
	// why main is public ==since execution starts from main method
	                         //main should be accessible by jvm
	                        //main method calling all the methods inside the class and out side
	                        //as a results main should be public
	// is main method can be private== yes
	
	 // why main should be static?
	                     //static should be up and ready to work all the time until close the application
	                     // main method should be the same way
	                    // for easier access main method should be static 
	//why main is void
	             //main method does not return anything
	             // by born it is a void
	// why method name is main== they just name it "main" reserve the the name for execution
	//String[] args== means it can take string arguments
	
	
	
	//this is instance method
	public void teachers() {
		//public void teachers()
		 // public == access modifier
		//void== return type=does not return anything
		//teachers== method name
		//()== method parameter
		//teachers()== method signature
		// {}== method body or scope
		
		
		
	}
	//this is static method
	public static void students() {
		
	}
	
	public void subject(String subject) {
		//subject== method name
		//(String subject)==String
		//subject(String subject)==method signature
		
	}
   public double tutuionFee() {
	  //double== return data type  
	return 0;
	   
   }
}
