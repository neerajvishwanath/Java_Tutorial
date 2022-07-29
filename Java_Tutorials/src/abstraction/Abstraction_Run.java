package abstraction;

public class Abstraction_Run {
	public static void main(String[] args) {


        Abstraction3 obj = new Abstraction3();


        obj.call();
        obj.message();
        obj.camera();

        System.out.println(obj.num1);
        System.out.println(Abstraction1.num2);
    }
}
