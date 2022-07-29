package interfacepackage;

public class Interface_Run {
	 public static void main(String[] args) {

	       // Interface_Implementation obj = new Interface_Implementation();
	        MyInterface obj = new Interface_Implementation();

	        obj.call();
	        obj.message();

	        System.out.println(MyInterface.num1);
	        System.out.println(MyInterface.num2);
	 
	    }
	 
	 
}
