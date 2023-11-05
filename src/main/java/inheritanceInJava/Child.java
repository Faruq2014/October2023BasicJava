package inheritanceInJava;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c= new Child();
		//child class data= child class constructor
		c.house();
		c.car();
		c.bankBanlance();
		
		
		//Parent c = new Child();
		//parent data type but child constructor
		// both way posibe
		// depends on you
		
		//Parent p = new Parent();
		//has a relationship
		//this is wrong in is-a-relationship
		

	}
	
	public void bankBanlance() {
		System.out.println("bank balance child method");
	}

}
