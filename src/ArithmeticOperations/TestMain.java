public class TestMain {

    public static void main(String[] args){

        //Assignment operator : =

        int x = 10; // initialization
        int y;  // declaration
         y =20;
        System.out.println("Value of x is : " + x + "\n" +"Value of y is : "+ y );
        System.out.println("\nAfter Swap --->>");
        int z = x;
        x =y ;
        y =z;
        System.out.println("Value of x is : " + x + "\n"+ "Value of y is : "+ y);

    }
}
