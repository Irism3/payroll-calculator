import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Please enter pay rate: ");
        double payRate = input.nextDouble();

        double grossPay = hoursWorked * payRate;

        //System.out.println("name "+ name);
       // System.out.println("grossPay "+ grossPay);
        input.close();

        System.out.print("name "+ name + " grossPay "+ grossPay);






    }
}
