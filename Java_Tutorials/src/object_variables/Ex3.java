package object_variables;

public class Ex3 {
	String str = "Hello Object";
	 
    public static void main(String[] args) {

        Ex3 obj = new Ex3();
        obj.str = "New Object";
        System.out.println(obj.str);
 
    }
}
