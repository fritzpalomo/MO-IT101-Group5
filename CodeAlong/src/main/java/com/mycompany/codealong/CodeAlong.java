
package com.mycompany.codealong;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodeAlong {

    public static void main(String[] args) {
          Employee _emp = new Employee();
          deductions _Ded = new deductions();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee No.: ");
            String employeeNo = sc.nextLine();
        try {
            _emp = _emp.GetEmployee(employeeNo);          
        } 
        
        catch (IOException | CsvValidationException ex) {
            Logger.getLogger(CodeAlong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    System.out.println("EMPLOYEE INFORMATION");
    System.out.println("Employee No.:" + _emp.getEmployeenumber());
    System.out.println("Last Name: " + _emp.getlastName());
    System.out.println("First Name: " + _emp.getFirstname());
    System.out.println("Address: " + _emp.getAddress());
    System.out.println("Birthdate:  " + _emp.getBirthday());
    System.out.println("Position: " + _emp.getPosition());
    System.out.println("Immediate Supervisor: " + _emp.getImmediateSupervisor());
    System.out.println("Status: " + _emp.getStatus());
    
    System.out.println("SALARY AND ALLOWANCES");
    System.out.println("Basic Salary: " + ;
    System.out.println("Rice Subsidy: " + _emp.getriceSubsidy());
    System.out.println("Phone Allowance: " + _emp.getphoneAllowance());
    System.out.println("Clothing Allowance: " + _emp.getStatus());
    System.out.println("Number of Hours Worked in a Week: " + hoursWorked);
    System.out.println("Gross Weekly Salary: " + grossWeeklySalary);
        
    
    System.out.println("DEDUCTIONS");
    System.out.println("SSS Contribution: " + sssContribution);
    System.out.println("Philhealth Contribution: " + philhealthContribution);
    System.out.println("Pag-ibig Contribution: " + pagibigMaxContribution);
    System.out.println("Withholding Tax: " + withholdingTax);
    System.out.println("Net Weekly Salary: " + netWeeklySalary);
    }
  
}
