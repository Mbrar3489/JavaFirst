import java.util.Scanner;

public class Calculator {
    public static void addition(double num1,double num2){
        double sum=num1+num2;
        System.out.println("Sum is: "+sum);
    }
    public static void subtraction(double num1,double num2){
        double sub=num1-num2;
        System.out.println("Subtraction is: "+sub);
    }
    public static void multiply(double num1,double num2){
        double multi=num1*num2;
        System.out.println("Multiplication is: "+multi);
    }
    public static void division(double num1,double num2){
        double div=num1/num2;
        System.out.println("Division is: "+div);
    }
    public static void modulus(double num1,double num2){
        double mod=num1%num2;
        System.out.println("Modulus is: "+mod);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        System.out.println("*********************");
        System.out.println("Please choose the options:");
        System.out.println("1.Addition \n2.Subtraction \n3.Multiply \n4.Division \n5.Modulus \n6.Exit");
        System.out.println("*********************");
        Scanner input = new Scanner(System.in);
        String continue1 ="Y"; String continue2;
        do {
            double num1=0; double num2=0;
            System.out.print("Option --> ");
            int option = input.nextInt();
            if(option>=1&&option<=5)
            {
            System.out.print("Enter first number: ");
             num1 = input.nextInt();
            System.out.print("Enter second number:");
             num2 = input.nextInt();
            }

            switch (option) {
                case 1: {
                    addition(num1, num2);
                    break;
                }
                case 2: {
                    subtraction(num1, num2);
                    break;
                }
                case 3: {
                    multiply(num1, num2);
                    break;
                }
                case 4: {
                    division(num1, num2);
                    break;
                }
                case 5: {
                    modulus(num1, num2);
                    break;
                }
                case 6: {
                    System.out.println("Exiting");
                    System.exit(0);
                }
                default: {
                    System.err.println("Invalid Option. Try again.");
                }
            } System.out.println("Do you want to continue? Y or N --> ");
              continue2 = input.next();
        } while (continue1.equalsIgnoreCase(continue2));

    }
}
