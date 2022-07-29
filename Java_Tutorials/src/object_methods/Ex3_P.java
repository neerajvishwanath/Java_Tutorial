package object_methods;

public class Ex3_P {
	public void myMethod(String fname) {
		System.out.println("His name is " + fname);
	}

	public static void main(String[] args) {
		Ex3_P obj = new Ex3_P();
		obj.myMethod("John");
		

	}
}
