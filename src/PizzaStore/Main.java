package PizzaStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("** Welcome To PizzaStore **");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of pizzas you want to order -> ");
        int pizzaCount= input.nextInt();
        PizzaStore[] pizzaStore=new PizzaStore[pizzaCount];

        int cheesePizzaCount=0;
        int meatLoverPizzaCount=0;
        int veggeLoverPizzaCount=0;
        int totalPrice=0;
        int choice;
        for(int i=0;i< pizzaStore.length;i++){
            do {
                System.out.print("Please Choose Pizza \n1.Cheese \n2.MeatLover " +
                        "\n3.VegLover\nEnter--> " );
                choice=input.nextInt();
            switch(choice){
                case 1:
                    pizzaStore[i]=new CheesePizza();
                    cheesePizzaCount++;
                    break;
                case 2:
                    pizzaStore[i]=new MeatLover();
                    meatLoverPizzaCount++;
                    break;
                case 3:
                    pizzaStore[i]=new VegLover();
                    veggeLoverPizzaCount++;
                    break;
                default:
                    System.out.println("Try again");
                    break;

            }
        }while(choice!=1&&choice!=2&&choice!=3);

        }
        for(int i=0;i< pizzaStore.length;i++){

            System.out.println((i+1)+"."+"Pizza Name -"+pizzaStore[i].itemName()+"\nPrice -$"+pizzaStore[i].getPrice()+"\nCalories -"
                    +pizzaStore[i].getCalories()+"\nDescription -"+pizzaStore[i].getProductDescription());
            totalPrice=totalPrice+pizzaStore[i].getPrice();

        }
        System.out.println("Your Total is :$"+totalPrice+
                "\n You ordered "+cheesePizzaCount+" Cheese Pizza "+meatLoverPizzaCount+" MeatLover Pizza "+veggeLoverPizzaCount+" Veggie Pizza");





    }
}
