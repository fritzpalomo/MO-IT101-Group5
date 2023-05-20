/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PayrollSystem;
import java.util.Scanner;

public class InitialCode {

    public static void main(String[] args) {
         // Input employee information
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        String empNumber = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Birthday (mm/dd/yyyy): ");
        String empBirthday = scanner.nextLine();
        System.out.print("Enter Monthly Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter Rice Subsidy: ");
        double riceSubsidy = scanner.nextDouble();
        System.out.print("Enter Phone Allowance: ");
        double phoneAllowance = scanner.nextDouble();
        System.out.print("Enter Clothing Allowance: ");
        double clothingAllowance = scanner.nextDouble();
        System.out.print            ("Enter Number of Hours Worked in a Week: ");
        int hoursWorked = scanner.nextInt();

        // Calculate Gross Semi-Monthly rate
        double grossSemiMonthlyRate = (basicSalary + riceSubsidy + phoneAllowance + clothingAllowance) / 2;

        // Calculate Hourly Rate
        double hourlyRate = (basicSalary / 21)/8;

        // Calculate Gross Weekly Salary
        double grossWeeklySalary = hourlyRate * hoursWorked;
        // Calculate SSS Contribution
        double sssContribution;
        if (basicSalary <= 3250) {
            sssContribution = 135;
        } else if (basicSalary <= 3750) {
            sssContribution = 157.50;
        } else if (basicSalary <= 4250) {
            sssContribution = 180;
        } else if (basicSalary <= 4750) {
            sssContribution = 202.50;
        } else if (basicSalary <= 5250) {
            sssContribution = 225;
        } else if (basicSalary <= 5750) {
            sssContribution = 247.50;
        } else if (basicSalary <= 6250) {
            sssContribution = 270;
        } else if (basicSalary <= 6750) {
            sssContribution = 292.50;
        } else if (basicSalary <= 7250) {
            sssContribution = 315;
        } else if (basicSalary <= 7750) {
            sssContribution = 337.50;
        } else if (basicSalary <= 8250) {
            sssContribution = 360;
        } else if (basicSalary <= 8750) {
            sssContribution = 382.50;
        } else if (basicSalary <= 9250) {
            sssContribution = 405;
        } else if (basicSalary <= 9750) {
            sssContribution = 427.50;
        } else if (basicSalary <= 10250) {
            sssContribution = 450;
        } else if (basicSalary <= 10750) {
            sssContribution = 472.50;
        } else if (basicSalary <= 11250) {
            sssContribution = 495;
        } else if (basicSalary <= 11750) {
            sssContribution = 517.50;
        } else if (basicSalary <= 12250) {
            sssContribution = 540;
        } else if (basicSalary <= 12750) {
            sssContribution = 562.50;
        } else if (basicSalary <= 13250) {
            sssContribution = 585;
        } else if (basicSalary <= 13750) {
            sssContribution = 607.50;
        } else if (basicSalary <= 14250) {
            sssContribution = 630;
        } else if (basicSalary <= 14750) {
            sssContribution = 652.50;
        } else if (basicSalary <= 15250) {
            sssContribution = 675;
        } else if (basicSalary <= 15750) {
            sssContribution = 697.50;
        } else if (basicSalary <= 16250) {
            sssContribution = 720.00;
        } else if (basicSalary <= 16750) {
            sssContribution = 742.50;
        } else if (basicSalary <= 17250) {
            sssContribution = 765.00;
        } else if (basicSalary <= 17750) {
            sssContribution = 787.50;
        } else if (basicSalary <= 18250) {
            sssContribution = 810.00;
        } else if (basicSalary <= 18750) {
            sssContribution = 832.50;
        } else if (basicSalary <= 19250) {
            sssContribution = 855.00;
        } else if (basicSalary <= 19750) {
            sssContribution = 877.50;
        } else if (basicSalary <= 20250) {
            sssContribution = 900.00;
        } else if (basicSalary <= 20750) {
            sssContribution = 922.50;
        } else if (basicSalary <= 21250) {
            sssContribution = 945.00;
        } else if (basicSalary <= 21750) {
            sssContribution = 967.50;
        } else if (basicSalary <= 22250) {
            sssContribution = 990.00;
        } else if (basicSalary <= 22750) {
            sssContribution = 1012.50;
        } else if (basicSalary <= 23250) {
            sssContribution = 1035.00;
        } else if (basicSalary <= 23750) {
            sssContribution = 1057.50;
        } else if (basicSalary <= 24250) {
            sssContribution = 1080.00;
        } else if (basicSalary <= 24750) {
            sssContribution = 1102.50;
        } else {
            sssContribution = 1125.00;
        }
        // Calculate Philhealth Contribution
        double philhealthContribution;
        if (basicSalary <= 10000) {
            philhealthContribution = basicSalary * 0.03 * 0.5;
        } else if (basicSalary <= 59999.99) {
            philhealthContribution = basicSalary * 0.03 * 0.5;
        } else {
            philhealthContribution = 1800 * 0.5;
        }

        // Calculate Pag-ibig Contribution
        double pagibigEmployeeContributionRate = 0;
        double pagibigEmployerContributionRate = 0;
        double pagibigTotalContributionRate = 0;
        double pagibigEmployeeContribution = 0;
        double pagibigEmployerContribution = 0;
        double pagibigTotalContribution = 0;
        double pagibigMaxContribution = 100;

        if (basicSalary >= 1000 && basicSalary <= 1500) {
            pagibigEmployeeContributionRate = 0.01;
            pagibigEmployerContributionRate = 0.02;
            pagibigTotalContributionRate = 0.03;
        } else if (basicSalary > 1500) {
            pagibigEmployeeContributionRate = 0.02;
            pagibigEmployerContributionRate = 0.02;
            pagibigTotalContributionRate = 0.04;
        }

        pagibigEmployeeContribution = basicSalary * pagibigEmployeeContributionRate;
        pagibigEmployerContribution = basicSalary * pagibigEmployerContributionRate;
        pagibigTotalContribution = pagibigEmployeeContribution + pagibigEmployerContribution;

        if (pagibigTotalContribution > pagibigMaxContribution) {
            pagibigTotalContribution = pagibigMaxContribution;
        }

        // Calculate Withholding tax
        double withholdingTax;
        if (basicSalary <= 20832) {
            withholdingTax = 0;
        } else if (basicSalary <= 33332) {
            withholdingTax = (basicSalary - 20832) * 0.20;
        } else if (basicSalary <= 66667) {
            withholdingTax = 2500 + (basicSalary - 33332) * 0.25;
        } else if (basicSalary <= 166667) {
            withholdingTax = 10833 + (basicSalary - 66667) * 0.30;
        } else if (basicSalary <= 666667) {
            withholdingTax = 40833.33 + (basicSalary - 166667) * 0.32;
        } else {
            withholdingTax = 200833.33 + (basicSalary - 666667) * 0.35;
        }

        // Calculate Net Weekly Salary
        double deductions = sssContribution + philhealthContribution + pagibigMaxContribution + withholdingTax;
        double netWeeklySalary = grossWeeklySalary - (deductions / 4);

        // Output employee information and salary details
        System.out.println("Employee Information:");
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Employee Name: " + empName);
        System.out.println("Birthday: " + empBirthday);
        System.out.println("Monthly Basic Salary: P" + basicSalary);
        System.out.println("Gross Semi-Monthly Rate: P" + grossSemiMonthlyRate);
        System.out.println("Hourly Rate: P" + hourlyRate);
        System.out.println("Number of Hours Worked in a Week: " + hoursWorked);
        System.out.println("Gross Weekly Salary: P" + grossWeeklySalary);
        System.out.println("Deductions: P");
        System.out.println("SSS Contribution: P" + sssContribution);
        System.out.println("Philhealth Contribution: P" + philhealthContribution);
        System.out.println("Pag-ibig Contribution: P" + pagibigMaxContribution);
        System.out.println("Withholding Tax: P" + withholdingTax);
        System.out.println("Net Weekly Salary: P" + netWeeklySalary);
    }
}
