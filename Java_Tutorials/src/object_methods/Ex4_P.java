package object_methods;

public class Ex4_P {

	public void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	public static void main(String[] args) {
		Ex4_P obj = new Ex4_P();
		obj.myMethod("John", 25);
		
		

	}

}
