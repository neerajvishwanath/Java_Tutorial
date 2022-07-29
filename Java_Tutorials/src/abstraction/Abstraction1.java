package abstraction;

public abstract class Abstraction1 {                                    // Abstract Class

    public int num1 = 10;

    public static int num2 = 20;

    public abstract void call();                            // Abstract Method(Method body is not defined)

    public abstract void message();                            // Abstract Method(Method body is not defined)

    public void camera() {                                    // Non abstract Method
        System.out.println("Camera works");
    }

}


