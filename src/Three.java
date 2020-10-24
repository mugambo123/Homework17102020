public class Three {
    int a = 25;// instance variables
    static int b = 36; // static variables
// main method
    public static void main(String[] args) {
        Three obj = new Three();
        System.out.println(obj.a+b);
        System.out.println(obj.a-b);
        obj.printMulti();
        printAddition();
    }
// instance method
    public void printMulti() {
        System.out.println(a*b);
    }
    // static method
    public static  void printAddition(){
        Three obj = new Three();
        System.out.println(obj.a+b);

    }

}
