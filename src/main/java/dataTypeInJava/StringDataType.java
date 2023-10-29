package dataTypeInJava;

public class StringDataType {

	public static void main(String[] args) {
		StringDataType sdt= new StringDataType();
		sdt.fullName();
	}

	
	public void fullName() {
		String firstName="Faruq";
		System.out.println(firstName);
		System.out.println("my first name is  "+firstName);
		//String is the data type
		// ""== Initialize in side the quotation
		// no limitation
		// " "=space is a value
		//Default value == null
		// only +, addition is allow
		// no other arithmetical function allow
		String lastName="Molla";
		System.out.println(lastName);
		System.out.println(lastName+" is my last name");
		String myFullName=firstName+lastName;
		System.out.println(myFullName);
	    myFullName=firstName+" "+lastName;
		System.out.println(myFullName);
		
		//what is Concatenation
		//some message passing to the reader through logging/print out put
		System.out.println("my full name is "+myFullName+ ", and I like it");
		 
	  //+ is over loaded operator in java
		// it is doing adding
		// as well use for concatenation 
	}
	
}
