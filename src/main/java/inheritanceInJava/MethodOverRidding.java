package inheritanceInJava;

public class MethodOverRidding extends GrandChild{

	public static void main(String[] args) {
		MethodOverRidding mor = new MethodOverRidding();
		mor.house();

	}
	@Override
	 protected void house() {
		String houseName="Faruq House";
		 System.out.println(houseName);
			System.out.println("over ridden House parent method");
			
		}

}
