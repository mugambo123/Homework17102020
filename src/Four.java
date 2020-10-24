public class Four {
    int salary = 45000;
    int employeeId = 30;// instance variables
    static String employerName = "Google Inc";
    static String location = "San Francisco";// static variables

    // main method
    public static void main(String[] args) {
        Four obj = new Four();
        System.out.println("employer's name is: " + employerName);
        System.out.println("location of employer is: " + location);
        System.out.println();
        obj.employmentData();
        System.out.println();
        employmentDetail();

    }

    // instance method
    public void employmentData() {
        System.out.println("Employer's Name is: " + employerName);
        System.out.println("Employer's Location is: " + location);
        System.out.println("Employee's Salary is: " + salary);
        System.out.println("Employee's Id is: " + employeeId);

    }

    // static method
    public static void employmentDetail() {
        Four obj = new Four();
        System.out.println("Employer's Name is: " + employerName);
        System.out.println("Employer's Location is: " + location);
        System.out.println("Employee's Salary is: " + obj.salary);
        System.out.println("Employee's Id is: " + obj.employeeId);
    }

}
