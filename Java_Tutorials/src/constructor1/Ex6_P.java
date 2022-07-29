package constructor1;

public class Ex6_P {
	int a;
	int b;
	String c;
	
	public Ex6_P() {
		a = 15;
	}
	
	public Ex6_P(int b) {
		this.b = b;
	}
	
	public Ex6_P(String c) {
		this.c = c;
	}

	public static void main(String[] args) {
	
		Ex6_P obj = new Ex6_P();
		System.out.println(obj.a);
		
		Ex6_P obj2 = new Ex6_P(20);
		System.out.println(obj2.b);
		
		Ex6_P obj3 = new Ex6_P("john");
		System.out.println(obj3.c);

	}

}
