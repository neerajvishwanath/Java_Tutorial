package object_methods;

public class Ex8_NP_R {
	public String myMethod() {
		return "Hello Method";
	}

	public static void main(String[] args) {
		Ex8_NP_R obj = new Ex8_NP_R();
		
		
		System.out.println(obj.myMethod());
		
		//OR
		/*
		String result = obj.myMethod();
		System.out.println(result);
		*/
		
	
	}
}
