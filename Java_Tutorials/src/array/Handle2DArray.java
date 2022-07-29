package array;

public class Handle2DArray {
	 public static void main(String[] args) {


	        //Ex1
	        int [][] arr1 = {{1,3,5,7},{2,4,6,8}};

	        System.out.println(arr1[0][0]);            
	        System.out.println(arr1[0][1]);                    
	        System.out.println(arr1[0][2]);                    
	        System.out.println(arr1[0][3]);            
	        System.out.println(arr1[1][0]);            
	        System.out.println(arr1[1][1]);            
	        System.out.println(arr1[1][2]);            
	        System.out.println(arr1[1][3]);            

	        System.out.println("******************************");

	        //Ex2
	        int [][] arr2 = new int [2][2];    

	        arr2[0][0] = 10;    
	        arr2[0][1] = 20;
	        arr2[1][0] = 30;
	        arr2[1][1] = 40;

	        System.out.println(arr2[0][0]);
	        System.out.println(arr2[0][1]);
	        System.out.println(arr2[1][0]);
	        System.out.println(arr2[1][1]);


	        }
}
