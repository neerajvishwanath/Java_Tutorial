package flowcontrolstatements;

public class HandleSwitchCase {
	public static void main(String[] args) {

        
        //Scenario 1(Integer)
        int marks = 100;

        switch(marks)
        {
        case 100 :
            System.out.println("Very Good");
            break;

        case 50 :
            System.out.println("OK");
            break;

        case 25 :
            System.out.println("Bad");
            break;

        default :
            System.out.println("Marks not applicable");
            break;
        }
        

        /*
        //Scenario 2(Character)
        char grade = 'B';

        switch(grade)
        {
        case 'A' :
            System.out.println("Excellent");
            break;

        case 'B' :
            System.out.println("Good");
            break;

        case 'C' :
            System.out.println("Bad");
            break;

        default :
            System.out.println("Grade not applicable");
            break;
        }
        */

        /*
        //Scenario 3(String)
                String week = "abc";

                switch(week)
                {
                case "Mon" :
                    System.out.println("Today is Monday");
                    break;

                case "Tue" :
                    System.out.println("Today is Tuesday");
                    break;

                case "Wed" :
                    System.out.println("Today is Wednesday");
                    break;

                case "Thu" :
                    System.out.println("Today is Thursday");
                    break;

                case "Fri" :
                    System.out.println("Today is Friday");
                    break;

                case "Sat" :
                    System.out.println("Today is Saturday");
                    break;    

                case "Sun" :
                    System.out.println("Today is Sunday");
                    break;    

                default :
                    System.out.println("Week day is not applicable");
                    break;
                }
        */
 
        

}
}
