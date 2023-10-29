package dataTypeInJava;

public class BooleanDataType {

	public static void main(String[] args) {
		BooleanDataType bdt= new BooleanDataType();
		bdt.buyFlower();

	}
	
	/*
	 * boolean=false, true
	 * default value==false/0
	 * false=0
	 * true=1
	 */
	
	public void buyFlower() {
		boolean isFlowerCost=true;
		System.out.println(isFlowerCost);
		
		if(isFlowerCost) {
			System.out.println("buy Flower");
		}
		
	}

}
