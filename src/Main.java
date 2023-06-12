import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Converter conv = new Converter();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there, welcome to the currency converter.\n Care to state your name?");
        String name = sc.next();
        System.out.println(name + ", follow the instructions to complete your task.");


        System.out.println("Choose from the list below: ");
        System.out.println("1.Ksh -> USD\n 2.USD -> Ksh\n 3.Ksh -> Euro\n 4.Euro -> Ksh");
        byte choice = sc.nextByte();

        if (choice == 1){
            conv.one();
        }
        if (choice == 2){
            conv.two();
        }
        if (choice == 3){
            conv.three();

        }
        if (choice == 4){
            conv.four();
            
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
