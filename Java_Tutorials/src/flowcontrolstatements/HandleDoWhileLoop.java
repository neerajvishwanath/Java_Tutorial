package flowcontrolstatements;

public class HandleDoWhileLoop {
	public static void main(String[] args) {



        //Ex 1                //Print 0 to 10
        int i = 0;
        do
        {
            System.out.print(i);
            i++;
        }    while(i<=10);

        System.out.println();


        //Ex 2                //Print 10 to 0
        int j = 10;
        do
        {
        System.out.print(j);
        j--;
        }while(j>=0);    

        System.out.println();


        //Ex 3                //Print 0 to 10 except 5
        int k = 0;
        do
        {
        if(k !=5)
        {
        System.out.print(k);
        }
        k++;
        }while(k<=10);

        System.out.println();


        //Ex 4        //Print 0 to 10 except 5 and 7
        int l = 0;
        do
        {
        if((l !=5) && (l !=7))
        {
        System.out.print(l);
        }
        l++;
        }while(l<=10);



    }
}
