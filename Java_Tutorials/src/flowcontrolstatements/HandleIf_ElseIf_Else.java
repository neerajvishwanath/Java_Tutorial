package flowcontrolstatements;

public class HandleIf_ElseIf_Else {
	public static void main(String[] args) {
		 
        // If-ElseIf-Else
        int a = 1, b = 2, c = 3;
 
        if (a > b) {
            System.out.println("Hello");
        } 
        else if (b > c) {
            System.out.println("Hi");
        }
        else {
            System.out.println("Bye");
        }
 
        
        // If-ElseIf-ElseIf-Else
        int x = 1, y = 2, z = 3;
 
        if (x > y) {
            System.out.println("Hello");
        } 
        else if (y > z) {
            System.out.println("Hi");
        } 
        else if (z > x) {
            System.out.println("Bye");
        }
        else {
            System.out.println("See you");
        }




        /*
        //E.g.

        String day = "tuesday";
        String mon = "monday", tue = "tuesday", wed = "wednesday", thu = "thursday", fri = "friday", sat = "saturday", sun = "sunday";
 
        if (day.equals(mon)) {
            System.out.println("Day is Monday");
        } 
        else if (day.equals(tue)) {
            System.out.println("Day is Tuesday");
        } 
        else if (day.equals(wed)) {
            System.out.println("Day is Wednesday");
        }
        else if(day.equals(thu)) {
            System.out.println("Day is Thursday");
        }
        else if(day.equals(fri)) {
            System.out.println("Day is Friday");
        }
        else if(day.equals(sat)) {
            System.out.println("Day is Saturday");
        }
        else if(day.equals(sun)) {
            System.out.println("Day is Thursday");
        }
        else{
            System.out.println("Invalid day");
        }

        */
 
 
    }
}
