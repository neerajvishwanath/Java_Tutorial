package constructor1;

public class Ex4_P {
	String name;
	int age;
	
	public Ex4_P(String x, int y) {
		name = x;
		age = y;
	}

	public static void main(String[] args) {
	
		Ex4_P obj = new Ex4_P("John", 25);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
}
