package motorPH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeDetailsArray {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Ian Vargas\\Documents\\motorPH\\EmployeeDetails.csv";
        String delimiter = ",";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee number: ");
            String searchEmployeeNumber = scanner.nextLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);

                String employeeNumber = data[0];
                String lastName = data[1];
                String firstName = data[2];
                String birthday = data[3];

                if (employeeNumber.equals(searchEmployeeNumber)) {
                    System.out.println("Employee Number: " + employeeNumber);
                    System.out.println("Last Name: " + lastName);
                    System.out.println("First Name: " + firstName);
                    System.out.println("Birthday: " + birthday);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
