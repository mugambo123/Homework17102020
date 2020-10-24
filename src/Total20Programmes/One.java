package Total20Programmes;

public class One {
    int x = 7; // instance variables outside main method but within class
    int y = 10;
// main method
    public static void main(String[] args) {
        One obj = new One();
        System.out.println(obj.x+1);
        obj.instanceMethod();

    }
// instance method
    public void instanceMethod(){
        System.out.println(x+y);

    }
}
