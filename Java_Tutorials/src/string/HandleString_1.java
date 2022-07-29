package string;

public class HandleString_1 {
	public static void main(String[] args) {
		 
        //Print String
        System.out.println("Hello String");                    
        System.out.println("Testing"+1+1);        
        System.out.println(1+1+"Testing");        
        System.out.println(1+1+"Testing"+1+1);

        System.out.println("*****************************");

        //String Variable
        String str = "How are you";
        System.out.println(str);
 
        System.out.println("*****************************");

        String concate = "How" + "are" + "you";
        System.out.println(concate);
 
        System.out.println("*****************************");

        //String Data Concatenation I
        String x = "Java";
        String y = "Programming";
        System.out.println(x+y);                        //Concatenation Operator(+)
        System.out.println(x.concat(y));                //Concatenation Method(concat)
        System.out.println(x.concat(" is useful"));                
        System.out.println(x.concat(" is useful").concat(" for se"));    
 
        System.out.println("*****************************");

        //String Data Concatenation II
        String firstName = "John";
        String lastName = "Well";
        System.out.println(firstName + " " + lastName);
 
        System.out.println("*****************************");

        //String Data Concatenate III
        String str1 = "10";
        String str2 = "20";
        System.out.println(str1+str2);
 
        System.out.println("*****************************");

        //String Lowercase
        String lowercase = str.toLowerCase();        
        System.out.println(lowercase);
 
        System.out.println("*****************************");

        //String Uppercase
        String uppercase = str.toUpperCase();        
        System.out.println(uppercase);
 
        System.out.println("*****************************");

        //String Replace
        System.out.println(str.replace('u', 'e'));
 
        System.out.println("*****************************");

        //Character Index Value
        System.out.println(str.indexOf('r'));    

        System.out.println("*****************************");

        //Character Value
        System.out.println(x.charAt(1));                    
 
        System.out.println("*****************************");

        //Substring
        System.out.println(y.substring(2, 5));    //programming
 
        System.out.println("*****************************");

        //String Length
        System.out.println(x.length());                        
 
        System.out.println("*****************************");

        //String Comparison
        String str3 = "AUTOMATION";
        String str4 = "TESTING";
        String str5 = "testing";

        System.out.println(str3.equals(str4));        //equals() Method    
        System.out.println(!str3.equals(str4));            
        System.out.println(str4.equals(str5));    
 
        System.out.println("*****************************");

        //equalsIgnoreCase
        System.out.println(str4.equalsIgnoreCase(str5));

        System.out.println("*****************************");

        //contains
        System.out.println(str5.contains("test"));

        System.out.println("*****************************");

        //endsWith
        System.out.println(str5.endsWith("ing"));

        System.out.println("*****************************");

        //startsWith
        System.out.println(str5.startsWith("test"));


        //split
        //Refer to Handle1DArray_Loop

        //toCharArray
        //Refer to Handle1DArray_Loop


    }
 
}
