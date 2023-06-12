import java.util.Scanner;

public class Converter {
    double amount, result;
    double kshToUsd = 0.0072;
    double kshToEuro = 0.0069;
    Scanner sc = new Scanner(System.in);
    public void one(){
        System.out.println("Enter amount you wish to convert: ");
        amount = sc.nextDouble();
        result = amount * kshToUsd;
        System.out.println("$"+ result);
    }
    public void two(){
        System.out.println("Enter amount you wish to convert: ");
        amount = sc.nextDouble();
        result = amount / kshToUsd;
        System.out.println("$"+ result);
    }
    public void three(){
        System.out.println("Enter amount you wish to convert: ");
        amount = sc.nextDouble();
        result = amount * kshToEuro;
        System.out.println("$"+ result);
    }
    public void four(){
        System.out.println("Enter amount you wish to convert: ");
        amount = sc.nextDouble();
        result = amount / kshToEuro;
        System.out.println("$"+ result);
    }
}
