public class Eighteen {
    public static void main(String[] args) {
        // java program and compute the sum of an integer.

        int num = 25;
        int rem = 0;
        int sum = 0;

        //num =25;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}

