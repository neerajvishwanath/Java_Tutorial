package array;

public class Handle2DArray_Loop {
	public static void main(String[] args) {


        //Ex1
        //For-Each Loop with 2D Array

        int arr1[][] = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}

            };
 
            for(int ele1[] : arr1)
            {    
                for(int ele2 : ele1)
                {
                    System.out.print(ele2);
                }
                System.out.println();
            }

        System.out.println("********************************");


        //Ex2
        int arr2[][] = {
                        {1,1,1,1},
                        {2,2,2,2},
                        {3,3,3,3}

                    };

        for(int i=0; i<3; i++)
        {    
            for(int j=0; j<4; j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        System.out.println("********************************");



        //Ex3
        int arr3[][] = {
                        {1,1,1,1},
                        {2,2,2},
                        {3,3,3,3,3}

                    };

        for(int i=0; i<arr3.length; i++)
        {    
            for(int j=0; j<arr3[i].length; j++)
            {
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }





    }
}
