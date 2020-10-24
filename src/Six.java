import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        double radius, area; // variables
        Scanner input = new Scanner(System.in);
        // Enter the radius of circle to calculate area of the circle
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius; // Static constant math operator to calculate area of circle
        System.out.println("Area of the Circle is " + area);
    }
}

