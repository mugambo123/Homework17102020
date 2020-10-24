import java.util.Scanner;

public class Fourteen {

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double area;
        double perimeter;

        areaOfRectangle();

    }
    public static void areaOfRectangle(){
        Scanner sc = new Scanner(System.in);// java input method
        System.out.println("Enter width of rectangle : ");
        double width = sc.nextDouble();

        System.out.println("Enter height of rectangle : ");
        double height = sc.nextDouble();

        double area = width * height; // formula to find area of rectangle

        System.out.println("Area of rectangle is : " + area);
        System.out.println();

        double perimeter = 2 * (width + height); // formula to find perimeter of rectangle

        System.out.println("Perimeter  of rectangle is : " + perimeter);










    }
}
