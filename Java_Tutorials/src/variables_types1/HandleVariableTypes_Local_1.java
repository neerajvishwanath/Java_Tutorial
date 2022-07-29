package variables_types1;

public class HandleVariableTypes_Local_1 {
	
	//Main method
    public static void main(String[] args)     

    {                                                

    int a = 10;                                

    System.out.println("Inside main method: " + a);

    //If block                
    if(true)
    {                                        //If block starts

    int b = 20;                                

    System.out.println("Local variable inside if block: " + b);

    System.out.println("Inside main method: " + a);

    }                                        


    //System.out.println(b);                //Error    for outside if block

    }                                        //Main method ends

    /*
    //Not allowed
    public static void myMethod1() {
        System.out.println("Inside static method: " + a);
    }

    public static void myMethod2() {
        System.out.println("Inside static method: " + b);
    }


    public void myMethod3() {
        System.out.println("Inside non-static method: " + a);
    }

    public void myMethod4() {
        System.out.println("Inside non-static method: " + b);
    }
    */


}
