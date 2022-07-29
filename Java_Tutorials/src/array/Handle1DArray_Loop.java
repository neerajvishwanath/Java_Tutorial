package array;

public class Handle1DArray_Loop {
	public static void main(String[] args) {


        //Array with For loop(int array)
        int[] arr1 = {10,20,30};


        for(int i=0; i<2; i++)                
        {
            System.out.println(arr1[i]);
        }


        System.out.println("*****************************");

        //OR


        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }


        System.out.println("*****************************");

        //OR

        //For-Each
        for(int element : arr1)
        {
            System.out.println(element);
        }


        System.out.println("*****************************");


        //Array with For loop(string array)
        String [] arrData = {"alpha","beta","gamma","delta","sigma"};

        for(int i=0; i<arrData.length; i++)
        {
            System.out.println(arrData[i]);
        }

        System.out.println("*****************************");

        //OR


        for(String keyword : arrData)
        {
            System.out.println(keyword);
        }

        System.out.println("*****************************");


        //Copy all values from array1 to array2
        int [] arr2 = {1, 2, 3, 4, 5};
        int [] arr3 = arr2;
        System.out.println(arr3.length);            
        for(int j=0; j<arr3.length; j++)
        {
            System.out.println(arr3[j]);
        }

        System.out.println("*****************************");

        //For-Each with If-Else
        int[] array = {10,20,30};
        for(int element : array)
        {
            if(element==10) {
                System.out.println("10 is equal to 10");
            }
            else {
                System.out.println("20 or 30 is not equal to 10");
            }
        }

        System.out.println("*****************************");

        //Split String

        String str = "How are you";
        System.out.println(str);
        String[] strArray = str.split(" ");
        for(int i=0; i<strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }

        System.out.println("*****************************");


        //String to char array
        char[] chArray = str.toCharArray();
        for(int i=0; i<chArray.length; i++)
        {
            System.out.println(chArray[i]);
        }

    }
}
