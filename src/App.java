//importing the Scanner utility from the java.util package
import java.util.Scanner;
//creating a class called App
public class App {
    public static void main(String[] args) throws Exception {
        //creating a Scanner object that automatically closes after the try block
        try (Scanner input = new Scanner(System.in)) {
            //prompting the owner (Bob to enter employee's name)
            System.out.println("Enter employee's name: ");
            //reading the input from the user
            String name = input.nextLine();
            //prompting the owner (Bob to enter employee's hourly rate)
            System.out.println("Enter employee's hourly rate: ");
            //reading the input from the user
            int hourlyRate = input.nextInt();
            //prompting the owner (Bob to enter employee's hours worked)
            System.out.println("Enter employee's hours worked: ");
            //reading the input from the user
            int hoursWorked = input.nextInt();
            //creating an object of the PaymentSlip class
            PaymentSlip employee1 = new PaymentSlip(name, hourlyRate, hoursWorked);
           //printing the payment information
System.out.println("--------------------");
System.out.println("## PAYMENT INFORMATION ##");
System.out.println("Name:\t\t\t" + employee1.getName() );
System.out.println("Hourly rate:\t\t$" + hourlyRate);
System.out.println("Hours worked:\t\t" + hoursWorked);
//printing empty line and then the salary before and after tax

System.out.println(" "); 
System.out.println("Salary before tax:\t$" + employee1.calculateSalary());
System.out.println("Salary after tax:\t$" + employee1.calculateNetSalary());
System.out.println("If you have any questions regarding your salary, contact Bob");
System.out.println("--------------------");
        }
        
    }
}