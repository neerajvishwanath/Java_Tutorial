package flowcontrolstatements;

public class HandleForLoop {
	 public static void main(String[] args) {


	        //Ex 1                //Print 0 to 10
	        for(int i = 0; i<=10; i++)
	        {
	            System.out.print(i);
	        }
	 
	        System.out.println();


	        //Ex 2                //Print 10 to 0
	        for(int j = 10; j>=0; j--)
	        {
	            System.out.print(j);
	        }

	        System.out.println();


	        //Ex 3                //Print 0 to 10 except 5 using If
	        for(int k = 0; k<=10; k++)
	        {
	        if(k !=5)
	        {
	        System.out.print(k);
	        }
	        }

	        System.out.println();


	        //Ex 4                //Print 0 to 10 except 5 & 7
	        for(int l = 0; l<=10; l++)
	        {
	        if((l !=5) && (l !=7))
	        {
	        System.out.print(l);
	        }
	        }

	        System.out.println();

	        //Ex 5                
	        for(int m = 0; m<=10; m=m+2)
	        {
	            System.out.print(m);
	        }


	    }
	 
}
