package operators;

public class HandleLogicalOperations {
	 
    public static void main(String[] args) {

        int num1 = 10, num2 = 20, num3 = 30;

        System.out.println(num1<num2 && num2<num3);        
        System.out.println(num1<num2 || num2>num3);     
        System.out.println(!(num1>num2 && num2<num3));            
        System.out.println(!(num1<num2 || num2>num3));    

    }
}