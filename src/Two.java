import jdk.internal.dynalink.beans.StaticClass;

public class Two {
    static int x = 50; // static variables
    static int y = 100;

    // main method
    public static void main(String[] args) {
        System.out.println(x * y);
        printVariables();
    }

    // static method
    public static void printVariables() {
        System.out.println(x);
        System.out.println(y);

    }

}
