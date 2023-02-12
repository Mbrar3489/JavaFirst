import java.util.Scanner;

public class MarksDemo {

    public static void main(String[] args){
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your marks: ");
        marks = sc.nextInt();
        if(marks<40)
        {
            System.out.println("Fail");
        } else if (marks >=40 && marks <=60) {
            System.out.println("Good");

        } else if (marks>=60  && marks <70) {
            System.out.println("Very Good");
        } else if (marks>70 && marks<90) {
            System.out.println("Excellent");


        } else  {
            System.out.println("You are a Champion");

        }


    }
}
