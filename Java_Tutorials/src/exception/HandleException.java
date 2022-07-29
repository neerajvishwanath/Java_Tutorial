package exception;

//import java.util.InputMismatchException;
//import java.util.Scanner;
 
public class HandleException {
 
    public static void main(String[] args) {

        /*
        //Arithmetic Exception
        int var1 = 10;
        int var2 = 0;
        int res = var1/var2;
        System.out.println(res);
        System.out.println("Hello Exception");        
        */


        /*
        //Arithmetic Exception Handling - Way I
        int var1;
        int var2;
        try {
            var1 = 10;
            var2 = 0;
            int res = var1/var2;
            System.out.println(res);
            System.out.println("Not excuted");
        } catch (Exception e) {
            System.out.println("Exception is caught");
            e.printStackTrace();
        }
        System.out.println("Exception Bypassed");    
        */


        /*
        //Arithmetic Exception Handling - Way II
        int var1;
        int var2;
        try {
            var1 = 10;
            var2 = 0;
            int res = var1 / var2;
            System.out.println(res);
            System.out.println("Not excuted");
        } catch (ArithmeticException e) {
            System.out.println("Exception is caught");
        }
        System.out.println("Exception Bypassed");        
        */


        /*
        //Input Mismatch Exception
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Integer number = ");                                
        int number = userInput.nextInt();                                    
        System.out.println("Entered number is = " + number);
        userInput.close();
        System.out.println("Input Exception");
        */

        /*
        //Input Mismatch Exception Handling
        try {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter Integer number = ");                                
            int number = userInput.nextInt();                                    
            System.out.println("Entered number is = " + number);
            userInput.close();

        }
        catch (Exception e)
        {

            System.out.println("Exception is caught");

        }
        System.out.println("Exception Bypassed");
        */

        /*
        //Finally Handling
        int var1;
        int var2;
        try {
            var1 = 10;
            var2 = 0;
            int res = var1 / var2;
            System.out.println(res);
            System.out.println("Not excuted");
        }
        catch (Exception e)
        {
            System.out.println("Exception Bypassed");
        }
        finally {
            System.out.println("Finally block executed");
        }
        */


        /*
        // Multiple Exceptions Handling
            int var1;
            int var2;
            try {

                var1 = 10;
                var2 = 0;
                int res = var1 / var2;
                System.out.println(res);


            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter Integer number = ");                                
            int number = userInput.nextInt();                                    
            System.out.println("Entered number is = " + number);
            userInput.close();

            System.out.println("Exception");
            }

            catch(ArithmeticException e1)
            {
            System.out.println("Arithmetic Exception is caught");
            }

            catch(InputMismatchException e2)
            {
            System.out.println("Input Mismatch Exception is caught");
            }

            System.out.println("Try-Catch bypassed");

            */
    }
 
}