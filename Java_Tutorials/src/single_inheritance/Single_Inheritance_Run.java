package single_inheritance;

public class Single_Inheritance_Run  extends Single_Inheritance{
 
    public static void main(String[] args) {

        Single_Inheritance_Run obj = new Single_Inheritance_Run();

        obj.driving();

        System.out.println(obj.car_brand);

        System.out.println(Single_Inheritance_Run.car_price);

        Single_Inheritance_Run.service();
        
    }

}
