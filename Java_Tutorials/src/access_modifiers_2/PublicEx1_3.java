package access_modifiers_2;

import access_modifiers_1.PublicEx1_1;

public class PublicEx1_3{

	public static void main(String[] args) {
		
		PublicEx1_1 obj = new PublicEx1_1();
		
		//Calling variable by using object
		System.out.println(obj.x);
		
		obj.myPublicMethod();
		

	}

}