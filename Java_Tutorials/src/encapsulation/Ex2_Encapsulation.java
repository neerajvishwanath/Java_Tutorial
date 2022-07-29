package encapsulation;

public class Ex2_Encapsulation {

	private int rollno;                                        
    private String name;


    public int getRollno() {
        return rollno;
    }


    public String getName() {
        return name;
    }



    public Ex2_Encapsulation(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

}
