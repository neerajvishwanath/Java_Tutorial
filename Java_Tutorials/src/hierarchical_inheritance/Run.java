package hierarchical_inheritance;

public class Run {
	public static void main(String[] args) {

        Child1 obj1 = new Child1();
        int add_res1 = obj1.add(30, 20);
        System.out.println(add_res1);

        Child2 obj2 = new Child2();
        int add_res2 = obj2.add(20, 10);
        System.out.println(add_res2);


 
    }

}
