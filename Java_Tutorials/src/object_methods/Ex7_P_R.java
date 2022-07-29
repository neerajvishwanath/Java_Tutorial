package object_methods;

public class Ex7_P_R {
	public int myMethod(int a, int b) {
		int sum = a + b;
		return sum;
		
	}

	public static void main(String[] args) {
		Ex7_P_R obj = new Ex7_P_R();
		int result = obj.myMethod(5,6);
		System.out.println(result);
		
	
	}
}
