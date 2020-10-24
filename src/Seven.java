import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        float temp;
        System.out.println("Enter the temperature in Fahrenheit to convert in to Celsius");
        Scanner sc = new Scanner(System.in);
        temp = sc.nextFloat();
        temp = (temp - 32) * 5 / 9; // Formula to convert Fahrenheit in to Celsius
        System.out.println("Temperature in degree Celsius  " + temp);
    }
}
