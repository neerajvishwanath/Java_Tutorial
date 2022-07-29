package collection;

import java.util.ArrayList;
import java.util.Collections;
 
public class MyArrayList {
 
    public static void main(String[] args) {


        //String ArrayList    
        ArrayList<String> cars = new ArrayList<String>();


        //Adding items to ArrayList            (It include duplicate values, ordered)
        cars.add("VOLVO");
        cars.add("BMW");
        cars.add("Ecosport");
        cars.add("volvo");
        cars.add("volvo");
        cars.add("1");
        cars.add("1.5");

        System.out.println(cars);


        //Access item from ArrayList
        System.out.println(cars.get(1));


        //Check item in ArrayList
        System.out.println(cars.contains("BMW"));


        //Change item in ArrayList
        cars.set(2, "Duster");
        System.out.println(cars);

        //ArrayList Size
        System.out.println(cars.size());

        System.out.println("*****************************************");

        //For Loop
        for (int i = 0; i<cars.size(); i++) {
        System.out.println(cars.get(i));
        }

        System.out.println("*****************************************");

        //For-Each Loop
        for (String i : cars) {
            System.out.println(i);
            }
 
        System.out.println("*****************************************");


        //Sorting
        System.out.println("**********Sorting**********");
        Collections.sort(cars);
        for(String i : cars) {
        System.out.println(i);
        }
        System.out.println("**********Sorting**********");


        //Reversing
        Collections.reverse(cars);    
        System.out.println(cars);


        //Remove item from ArrayList
        cars.remove("Duster");
        //cars.remove(3);
        System.out.println(cars);


        //Remove ArrayList
        cars.clear();
        System.out.println(cars);
 
        //Empty ArrayList Verification
        System.out.println(cars.isEmpty());


        //Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);


        //Double ArrayList
        ArrayList<Double> decNumbers = new ArrayList<Double>();
        decNumbers.add(10.1);
        decNumbers.add(15.1);
        decNumbers.add(20.1);
        System.out.println(decNumbers);
 
        //Multiple data ArrayList
        ArrayList<Object> multiData = new ArrayList<Object>();
        multiData.add("John");
        multiData.add('b');
        multiData.add(15);
        multiData.add(20.5);
        multiData.add(true);
        System.out.println(multiData);




 
    }
 
}
