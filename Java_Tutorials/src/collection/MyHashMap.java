package collection;

import java.util.HashMap;

public class MyHashMap {
 
    public static void main(String[] args) {

        //String HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)                (It does not include duplicate values, unordered)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington");
        System.out.println(capitalCities);


        //Access item from HashMap
        System.out.println(capitalCities.get("England"));


        //Check key/value in HashMap
          System.out.println(capitalCities.containsKey("England"));
          System.out.println(capitalCities.containsValue("London"));


          //Change item in HashMap
          capitalCities.replace("USA", "Washington", "Newyork");
        System.out.println(capitalCities);


          //HashMap Size
        System.out.println(capitalCities.size());


        //For-Each Loop for Print keys
        for (String i : capitalCities.keySet()) {
          System.out.println(i);
        }


        //For-Each Loop for Print values
        for (String i : capitalCities.values()) {
          System.out.println(i);
        }



       //Remove item from HashMap
       capitalCities.remove("England");
       System.out.println(capitalCities);


       //Remove HashMap
       capitalCities.clear();
       System.out.println(capitalCities);

     //Empty HashMap Verification
     System.out.println(capitalCities.isEmpty());

     HashMap<String, Integer> people = new HashMap<String, Integer>();

       // Add keys and values (Name, Age)
       people.put("John", 32);
       people.put("Steve", 30);
       people.put("Angie", 33);
 
       for (String i : people.keySet()) {
       System.out.println("key: " + i + " value: " + people.get(i));
        }


      }

 

}
