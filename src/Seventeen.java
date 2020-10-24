import java.util.Scanner;
// converting decimal number into binary number
public class Seventeen {
    public static void main(String[] args) {
        int number = 5, i = 0;
        int binary[] = new int[100];
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the decimal number you wish to convert into binary number");
        number = user_input.nextInt();

        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("Binary value is : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.println("" + binary[j]);
        }
    }


}