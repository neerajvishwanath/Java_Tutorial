package basic;

import java.util.Scanner;

public class HandleInput {
 
    public static void main(String[] args) {

        //Creating object of Scanner class
        //classname variablename = new constructor()
        Scanner userInput = new Scanner(System.in);

        //String    
        System.out.println("Enter String = ");
        String word = userInput.nextLine();            
        System.out.println("Entered String is = " + word);

        System.out.println("*******************************");


        //Integer
        System.out.println("Enter Integer number = ");                                
        int number = userInput.nextInt();                                    
        System.out.println("Entered number is = " + number);
 
        System.out.println("*******************************");

        //Float
        System.out.println("Enter Decimal number = ");
        float decimalNumber = userInput.nextFloat();
        System.out.println("Entered number is = " + decimalNumber);
 
        System.out.println("*******************************");

        //Character
        System.out.println("Enter character = ");
        char ch = userInput.next().charAt(0);
        //char ch = scanner.next().charAt(1);                    //Enter at least 2 characters
        System.out.println("Entered character is = " + ch);
 
        System.out.println("*******************************");

        //Boolean
        System.out.println("Enter boolean value = ");            //Enter True or False
        boolean bool = userInput.nextBoolean();
        System.out.println("Entered  boolean value is = " + bool);


        userInput.close();

 
    }
 
}