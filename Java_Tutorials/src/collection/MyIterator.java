package collection;

import java.util.ArrayList;
import java.util.Iterator;
 
public class MyIterator {
 
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ecosport");

        //Iterator Loop
        Iterator<String> itr = cars.iterator();

        //Looping through a collection
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("*********************************");

        //For Loop
        for(int j=0; j<cars.size(); j++) {
            System.out.println(cars.get(j));
        }

        System.out.println("*********************************");

        //For-Each Loop 
        for(String str : cars) {
            System.out.println(str);
        }
    }
 

}
