import java.util.Scanner;

public class InputValue {

    public static void main(String[] args)
    {
        int a,b;
        Scanner values= new Scanner(System.in);
        System.out.printf("Enter the value of a:");
        a= values.nextInt();
        System.out.printf("Enter Value of b:");
                b= values.nextInt();
        if(a==b)
        {
            System.out.println("a and b are same numbers.");
        }
        else {

            System.out.println("a and b are not same numbers.");
        }
        System.out.println();

    }}
