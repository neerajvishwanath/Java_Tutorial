package array;

public class Handle1DArray {
	public static void main(String[] args) {


        //Using Integer type Array as variable        

        int[] arr1 = {10, 20, 30, 30};        

        //System.out.println(arr1);


        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        //System.out.println(arr1[4]);

        System.out.println("*****************************");

        System.out.println(arr1[0]+arr1[1]+arr1[2]+arr1[3]);

        System.out.println("*****************************");


        //Using Integer type Array as object
        int [] arr2 = new int [3];            

        arr2[0] = 10;                        
        arr2[1] = 20;                    
        arr2[2] = 30;                        

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println("*****************************");


        //Using String type Array as variable
        String[] arr3 = {"India", "USA", "UK"};            
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        System.out.println("*****************************");


        //Using String type Array as object
        String [] arr4 = new String [3];        

        arr4[0] = "Earth";                        
        arr4[1] = "Sun";                        
        arr4[2] = "Moon";                        

        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        System.out.println("*****************************");


        //Print array length
        String [] country = {"India", "America", "UK"};
        int fullarray = country.length;
        System.out.println(fullarray);



        System.out.println("*****************************");

        //Print 1st array element
        String firstarrayelement = country[0];
        System.out.println(firstarrayelement);


        System.out.println("*****************************");

        //Print last array element
        String lastarrayelement = country[2];
        System.out.println(lastarrayelement);


        System.out.println("*****************************");


        //Copy one value from 1 array to another array
        int [] arr5 = {1, 2, 3, 4, 5};
        int [] arr6 = {arr5[4]};
        System.out.println(arr6[0]);        


        System.out.println("*****************************");


        //Change an Array Element
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);

    }
 
}
