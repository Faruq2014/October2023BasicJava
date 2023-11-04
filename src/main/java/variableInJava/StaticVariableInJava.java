package variableInJava;

public class StaticVariableInJava {
	
final static String lastName="Molla";

	public static void main(String[] args) {
		StaticVariableInJava svij=new StaticVariableInJava();
		svij.faruq();
		svij.tania();
		svij.sadia();
		

	}
	
	public void faruq() {
		System.out.println(lastName);
	}
	
	public void tania() {
		System.out.println(lastName);
	}
	
	public void sadia() {
		System.out.println(lastName);
	}

}
