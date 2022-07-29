package encapsulation;

public class Ex1_Encapsulation_Run {

	public static void main(String[] args) {

        Ex1_Encapsulation obj = new Ex1_Encapsulation();


        //We should use getter & setter to access these variables


        obj.setRollno(2);                                //Setting the data
        obj.setName("John");

        System.out.println(obj.getRollno());            //Getting the data
        System.out.println(obj.getName());

        obj.setRollno(4);                                //Setting the data
        obj.setName("david");

        System.out.println(obj.getRollno());            //Getting the data
        System.out.println(obj.getName());



 
    }
}
