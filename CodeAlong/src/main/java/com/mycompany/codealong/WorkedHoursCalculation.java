
package com.mycompany.codealong;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class WorkedHoursCalculation {
         
        public WorkedHoursCalculation GetEmployee(String EmployeeNo)throws IOException, ParseException, CsvValidationException {
        String filename = "/Users/johnallenalcantara/Downloads/MotorPH Employee Data - Attendance Details.csv";
        CSVReader reader = new CSVReader(new FileReader(filename));
        String[] header = reader.readNext();
        String[] time;
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
     
        while ((time = reader.readNext())!= null){

                // Parse time in and out
                Date timeIn = timeFormat.parse(time[4]);
                Date timeOut = timeFormat.parse(time[5]);

                // Calculate worked hours
                long minutesWorked = (timeOut.getTime() - timeIn.getTime()) / (60 * 1000);
                long gracePeriod = 10; // 10-minute grace period
                long minutesDeducted = Math.max(minutesWorked - gracePeriod, 0);
                double hoursWorked = (double) minutesDeducted / 60;
                }
        
            return null;
        }
}
