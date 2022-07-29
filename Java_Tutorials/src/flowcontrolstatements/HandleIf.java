package flowcontrolstatements;

public class HandleIf {
	public static void main(String[] args) {


        //Single Condition
		/*
        //E.g. 1
        if(true) {
            System.out.println("Hi");
        }

        System.out.println("********************************");

        //E.g. 2
        if(false) {
            System.out.println("bye");
        }
 
        System.out.println("********************************");

		*/
        //Positive
        int a = 10, b = 5;

        if(a<b)
        {
            System.out.println("positive true");
        }
 
        System.out.println("********************************");


        //Negative
        int d = 5, e = 10;

            if(!(d>e))
            {
                System.out.println("negative true");
            }
 
        System.out.println("********************************");


        //Compound Condition

            int x = 10, y = 8, z = 5;
            if((x>y) && (x>z))
            {
                System.out.println("true");
            }
 
        System.out.println("********************************");


        //Using equals() method

        String month1 = "january";
        if(month1.equals("january"))
        {
            System.out.println("Month is January");
        }
 
        System.out.println("********************************");

        //Using relational(==) operator

        int month2 = 2;
        if(month2==2)
        {
        System.out.println("Month is February");
        }

        System.out.println("********************************");


        //Multiple If
        int f = 10, g = 20, h = 30, i = 40;
        if(f>g) {
            System.out.println("Hello");
        }
        if(g>h) {
            System.out.println("Hi");
        }
        if(h<i) {
            System.out.println("bye");
        }
}
}
