import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number ; ");
        String x = sc.next(); // binary pattern will read and gets stored into variable x
        System.out.println("Enter second Binary number");
        String y = sc.next(); // binary pattern will read and gets stored into variable y

        // converting binary number into corresponding integer number
        int n1 = Integer.parseUnsignedInt(x,2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1+n2;

        // converting back into binary sequence
        System.out.println("n1 : " + Integer.toBinaryString(n1));
        System.out.println("n2 : " + Integer.toBinaryString(n2));
        System.out.println("n3 : " + Integer.toBinaryString(n3));

    }
}
