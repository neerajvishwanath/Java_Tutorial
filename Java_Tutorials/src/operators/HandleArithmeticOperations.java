package operators;

public class HandleArithmeticOperations {
	public static void main(String[] args) {
		 
        int num1 = 20, num2 = 10, addition, subtraction, multiplication, division, modulus, increment, decrement;
 
        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = num1 / num2;
        modulus = num1 % num2;
        increment = ++num1; // num1=num1+1
        decrement = --num1; // num1=num1-1
 
        System.out.println("Sum of num1 and num2 = " + addition);
        System.out.println("Sub of num1 and num2 = " + subtraction);
        System.out.println("Mul of num1 and num2 = " + multiplication);
        System.out.println("Div of num1 and num2 = " + division);
        System.out.println("Mod of num1 and num2 = " + modulus);
        System.out.println("Increment of num1 = " + increment);
        System.out.println("Decrement of num1 = " + decrement);
 
    }
}
