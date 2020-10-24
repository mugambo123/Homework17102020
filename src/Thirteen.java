import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;
        double average;


        Scanner fetch = new Scanner(System.in);
        System.out.println("Enter first number : ");
        number1 = fetch.nextDouble();


        System.out.println("Enter second number :");
        number2 = fetch.nextDouble();

        System.out.println("Enter third number :");
        number3 = fetch.nextDouble();

        // calculate average of three input numbers
        average = (double) (number1+number2+number3)/3;

        System.out.println("The average of three input numbres is : " + average);
    }
}
