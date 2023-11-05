package inheritanceInJava;

public class Parent {

	public static void main(String[] args) {
		Parent p = new Parent();
		
	}
	
	public Parent() {
		super();
		System.out.println("super constructor");
	}
    private void phone() {
    	System.out.println("phone parent method");
}
	  void house() {
		  String houseName="Atiq House";
		  System.out.println(houseName);
		System.out.println("House parent method");
	}
	
	protected void car() {
		System.out.println("car parent method");
	}
	public void furnitue() {
		System.out.println("car parent method");
	}
	final public void neckles() {
		System.out.println("car parent method");
	}

}
