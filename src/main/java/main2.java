import java.io.*;

public class main2 {
    public static void main(String[] args) throws FileNotFoundException {

        // id| name | hours worked | pay rate
        //  0 | 1   |     2        |     3

        try (FileWriter writer = new FileWriter("src/main/resources/payroll.json");) {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] sections = input.split("\\|");


                int employeeId = Integer.parseInt(sections[0]);
                String name = sections[1];
                double hoursWorked = Double.parseDouble(sections[2]);
                double hourlyRate = Double.parseDouble(sections[3]);
                Employee employee = new Employee(employeeId, name, hoursWorked, hourlyRate);
                System.out.println(employeeId + " " + employee.getName() + " " + employee.getGrosspay());
                writer.write("Employee name" + employee.getName() + " " + employee.getGrosspay() + "\n");

            }


        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file;" + e);

        } catch (IOException e) {
            System.out.println("IO Exception i don't understand" + e);
        }

    }
}
