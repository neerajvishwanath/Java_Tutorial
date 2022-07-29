package variables_types1;

public class HandleVariableTypes_Global_1 {
	public int a = 10;                            

    public static int b = 20;                            

    //Main method
    public static void main(String[] args)     

    {


    //System.out.println("Inside main method: " + a);                    //Not allowed

    System.out.println("Inside main method: " + b);                        //Allowed

    //If block
    if(true)
    {                                        
    //System.out.println("Inside if block: " + a);                        //Not allowed
    System.out.println("Inside if block: " + b);
    }                                        

    //Calling static method
    //myMethod1();                            //Not allowed

    myMethod2();

    //Calling non static method
    HandleVariableTypes_Global_1 obj = new HandleVariableTypes_Global_1();
    obj.myMethod3();                        

    obj.myMethod4();



    }                                        

    //Not Allowed
    /*
    public static void myMethod1() {
        System.out.println("Inside static method: " + a);
    }
    */

    public static void myMethod2() {
        System.out.println("Inside static method: " + b);
    }

    public void myMethod3() {
        System.out.println("Inside non-static method: " + a);
    }

    public void myMethod4() {
        System.out.println("Inside non-static method: " + b);
    }


    
}
