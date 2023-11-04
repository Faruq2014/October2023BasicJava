package variableInJava;

public class InstanceVariableInJava {
	
	//instance variable
  public String firstName;
  
  public static void main(String[] args) {
	  InstanceVariableInJava ivij= new InstanceVariableInJava();
	  ivij.faruq();
	  ivij.tania();
	  ivij.sadia();

	}//end of main
	
	public void faruq() {
		firstName="Faruq";
		System.out.println(firstName);
		
	}//end of faruq
	
	public void tania() {
		firstName="Tania";
		System.out.println(firstName);
	}

	
	public void sadia() {
		firstName="Sadia";
		System.out.println(firstName);
	}
  
	
}
