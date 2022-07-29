package object_methods;

public class Ex9_NP_R {
	public int myMethod() {
		int a = 5;
		int b = 6;
		int sum = a + b;
		return sum;
		
	}

	public static void main(String[] args) {
		Ex9_NP_R obj = new Ex9_NP_R();
		int result = obj.myMethod();
		System.out.println(result);
		
	
	}
}
