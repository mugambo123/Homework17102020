package Top20Programmes;

import java.util.Scanner;

public class Ten {
    static Integer i;
    static Integer a;
       Float number;
    int number1;

    public static void main(String[] args) {
        floatTable(); // method of getting the float number multiplied
        integerTable(); // method of getting the integer number multiplied

    }
    private static void floatTable()
    { Ten obj = new Ten();
        Scanner sc = new Scanner(System.in);// java input method
        System.out.println("Enter the float number you wish to print multiplication table");// table for float numbers
        obj.number = sc.nextFloat(); // storing the value from command line
        //for loop
        for (i = 1; i <= 10; i++)
            System.out.println(obj.number + "*" + i + "=" + (obj.number * i));}


       public static void integerTable(){
           Ten obj = new Ten();
            Scanner fetch = new Scanner(System.in);// java input method
            System.out.println("Enter the integer number you wish to print multiplication table");// table for integer numbers
            obj.number1 = fetch.nextInt();
            // for loop
            for (a = 1; a <= 10; a++)
                System.out.println(obj.number1 + "*" + a + "=" + (obj.number1 * a));
        }
    }

                
            
            
        

                    


        

    






