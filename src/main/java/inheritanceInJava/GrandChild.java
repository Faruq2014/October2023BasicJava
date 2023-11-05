package inheritanceInJava;

public class GrandChild extends Child{

	public static void main(String[] args) {
		GrandChild gc= new GrandChild();
		gc.house();
		gc.car();
		gc.bankBanlance();
		gc.vedioGame();
		

	}
	
	
	public void vedioGame() {
		System.out.println("vedio game Grand child method");
	}

}
