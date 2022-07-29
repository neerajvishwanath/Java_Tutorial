package polymorphism_methodoverloading;

public class MethodOverloading1 {

	 public void add(int x, int y) {
	        System.out.println(x+y);
	    }

	    public void add(double x, double y) {
	        System.out.println(x+y);
	    }



	    public static void main(String[] args) {

	        MethodOverloading1 obj = new MethodOverloading1();
	        obj.add(2, 3);
	        obj.add(1.5, 2.5);
	 
	    }
	 
	}
