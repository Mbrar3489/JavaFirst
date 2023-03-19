import java.util.Scanner;

public class Task1 {

    // Print even number from 0 to 1000 using For Loop.

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First number: ");
        int min= sc.nextInt();
        System.out.print("Enter Second number: ");
        int max=sc.nextInt();
        System.out.println("Even numbers from " + min + " to " +max);
  for(int i = min; i<=max;i++){
      for(int n=i; n%2==0; n++){
          System.out.println(" "+n);}
  }
    }
}
