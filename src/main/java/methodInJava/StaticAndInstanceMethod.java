package methodInJava;

public class StaticAndInstanceMethod {
	

	public static void main(String[] args) {
		StaticAndInstanceMethod saim= new StaticAndInstanceMethod();//refferencial variable
		saim.teachers();//method calling
		saim.m1();
		m4();
		
		student();
	}
	
	public void teachers() {
		String teacherName="Faruq";
		System.out.println(teacherName);
	}
	
	public static void  student() {
		String StudentName="Rozina";
		System.out.println(StudentName);
		
	}
	
	// static method going inside static method is direct access
	
	
	
	//instance method going inside the static method indirect/class refferencial  
	
	
	
	public void m1() {
		m2();
	}
	
   public void m2() {
		System.out.println("i am m2 method");
	}
   // instance method going inside instance method direct access
   
   
   
	public void m3() {
		m4();
	}
	
	public static void m4() {
		System.out.println("I am static method m4");
	}
	
	// static method going inside the instance method direct access

}
