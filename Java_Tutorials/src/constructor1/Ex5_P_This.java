package constructor1;

public class Ex5_P_This {
	String name;
	int age;
	
	public Ex5_P_This(String name, int age) {		
		this.name = name;					//this.name --> It is at class level & name --> It is at constructor level
		this.age = age;						//this.age -->  It is at class level & age -->  It is at constructor level
	}

	public static void main(String[] args) {
	
		Ex5_P_This obj = new Ex5_P_This("John", 25);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
}
