package multilevel_inheritance;

public class Run {
	public static void main(String[] args) {

        Child obj = new Child();

        int add_res = obj.add(20, 10);
        int sub_res = obj.sub(20, 10);
        int mul_res = obj.mul(20, 10);

        System.out.println(add_res);
        System.out.println(sub_res);
        System.out.println(mul_res);
 
    }

}
