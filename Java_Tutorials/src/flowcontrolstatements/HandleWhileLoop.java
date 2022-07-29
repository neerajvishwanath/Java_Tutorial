package flowcontrolstatements;
 
public class HandleWhileLoop {
 
    public static void main(String[] args) {


        //Ex 1        //Print 0 to 10
        int i = 0;
        while(i<=10)
        {
            System.out.print(i);
            i++;
        }

        System.out.println();


        //Ex 2        //Print 10 to 0
        int j = 10;
        while(j>=0)
        {
        System.out.print(j);
        j--;
        }

        System.out.println();    


        //Ex 3        //Print 0 to 10 except 5
        int k = 0;
        while(k<=10)
        {
        if(k !=5)
        {
        System.out.print(k);
        }
        k++;
        }
 
        System.out.println();


        //Ex 4        //Print 0 to 10 except 5 and 7
        int l = 0;
        while(l<=10)
        {
        if((l !=5) && (l !=7))
        {
        System.out.print(l);
        }
        l++;
        }



    }


    }
 