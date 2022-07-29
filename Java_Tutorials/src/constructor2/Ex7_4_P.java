package constructor2;

import constructor1.Ex7_1_P;

public class Ex7_4_P extends Ex7_1_P {


    //Make constructor protected in Ex7_1_P class
    public Ex7_4_P(String name, int age) {
        super(name, age);

    }
 
    public static void main(String[] args) {

        Ex7_4_P obj = new Ex7_4_P("David", 20);
        System.out.println(obj.name);
        System.out.println(obj.age);
 
    }
 
}
