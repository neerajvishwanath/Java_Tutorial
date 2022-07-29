package polymorphism_methodoverriding;

public class MethodOverriding_Child extends MethodOverriding_Parent {

	    public void eat() {
	        System.out.println("Child is eating");
	    }

	    public static void main(String[] args) {

	    MethodOverriding_Child obj1 = new MethodOverriding_Child();
	    obj1.eat();                

	    MethodOverriding_Parent obj2 = new MethodOverriding_Parent();
	    obj2.eat();            

	    MethodOverriding_Parent obj3 = new MethodOverriding_Child();
	    obj3.eat();            

	    //MethodOverriding_Child obj4 = new MethodOverriding_Parent();
	    //obj4.eat();        

	    }
	 
	}
