package myclass;

public class Outer_Inner_Class_Run {

	public static void main(String[] args) {

        Outer obj1 = new Outer();
        obj1.show1();

        Outer.Inner obj2 = obj1.new Inner();
        obj2.show2();
 
    }
 
}
