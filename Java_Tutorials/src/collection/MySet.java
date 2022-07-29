package collection;

import java.util.HashSet;
import java.util.Set;
 
public class MySet {
 
    public static void main(String[] args) {

    Set<String> cars = new HashSet<String>();

    cars.add("VOLVO");
    cars.add("BMW");
    cars.add("Ecosport");
    cars.add("Volvo");
    cars.add("Volvo");
    cars.add("1");
    cars.add("1.5");
    System.out.println(cars);
 
    }
 

}
