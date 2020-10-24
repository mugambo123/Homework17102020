package Total20Programmes;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {

        // base and height
        int base;
        int height;

        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of base of triangle : ");
        base = sc.nextInt();

        System.out.println("Enter the length of height of triangle :");
        height = sc.nextInt();

// formula to calculate area of triangle is : (base * height) / 2

        area = (base * height) / 2;

        System.out.println("The area of triangle is : " + area);


    }
}
