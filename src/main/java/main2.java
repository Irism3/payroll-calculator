import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws FileNotFoundException {

        // id| name | hours worked | pay rate
        //  0 | 1   |     2        |     3

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            bufferedReader.readLine();
            String employees;

            while ((employees = bufferedReader.readLine()) != null) {
                String input = bufferedReader.readLine();
                String[] sections = input.split("\\|");


                int employeeId = Integer.parseInt(sections[0]);
                String name = sections[1];
                double hoursWorked = Double.parseDouble(sections[2]);
                double hourlyRate = Double.parseDouble(sections[3]);
                Employee employee = new Employee(employeeId, name, hoursWorked, hourlyRate);
                System.out.println(employeeId + " " + employee.getName() + " " + employee.getGrosspay());

            }


        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file;" + e);

        } catch (IOException e) {
            System.out.println("IO Exception i don't understand" + e);
        }

    }
}
