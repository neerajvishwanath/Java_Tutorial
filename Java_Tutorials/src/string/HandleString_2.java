package string;

public class HandleString_2 {
	public static void main(String[] args) {

        String emptyString = "";
        String whiteSpaceString = "    ";
        String trimString = "    Go  ";

        System.out.println(emptyString.length());
        System.out.println(emptyString.isEmpty());
        //System.out.println(emptyString.isBlank());

        System.out.println("***********************************");

        System.out.println(whiteSpaceString.length());
        System.out.println(whiteSpaceString.isEmpty());
        //System.out.println(whiteSpaceString.isBlank());

        System.out.println("***********************************");
        System.out.println(trimString.length());
        System.out.println(trimString.isEmpty());
        //System.out.println(trimString.isBlank());
        System.out.println(trimString.trim());
    }
 
}
