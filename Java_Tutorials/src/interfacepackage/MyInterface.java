package interfacepackage;

public interface MyInterface {


    public static int num1 = 10;
    //OR
    public int num2 = 20;                //By default each variable in interface is a static variable
 
    
    public abstract void call();
    //OR
    //public void call();                //By default each method in interface is an abstract method
 
    
    public abstract void message();

}