public class Fifteen {
    static int x = 50;
    static int y = 100;

    public static void main(String[] args) {

// swap two variables
        int temp = x;
        int x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}