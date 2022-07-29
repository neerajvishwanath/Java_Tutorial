package polymorphism_methodoverloading;

public class MethodOverloading2 {
	public void show(int a){
        System.out.println(a);
    }

    public void show(int a, int b){
        System.out.println(a+b);
    }
 
    public static void main(String[] args) {

        MethodOverloading2 obj = new MethodOverloading2();
        obj.show(10);
        obj.show(10,20);
 
    }
}
