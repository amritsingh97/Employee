package employee;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeTest {

    public static void main(String[] args) {

        HourlyEmployee e = new HourlyEmployee("Adam", "Baum", 1234, LocalDate.of(1997, Month.MARCH, 23), 25.20);
        
        System.out.printf("The Hourly employee is: %s%n", e);
    
        e.recordHoursWorked(8);
        e.recordHoursWorked(7);
        e.recordHoursWorked(5);
    
        System.out.printf("%s%n", e.getPayCheck());
        
        e.recordHoursWorked(5);
        System.out.printf("%s%n", e.getPayCheck());
        
        
        CommissionEmployee cE = new CommissionEmployee("C", "J", 1234, LocalDate.of(1995, Month.MARCH, 23), 5);
        
        System.out.printf("The second employee is: %s%n", cE);
    
        cE.recordMonthlySales(100);
        cE.recordMonthlySales(400);
        
        System.out.printf("%s%n", cE.getPayCheck());
        
        
        BasePlusCommissionEmployee bCE = new BasePlusCommissionEmployee("J", "J", 1234, LocalDate.of(1995, Month.MARCH, 23), 5, 1000);
        
        System.out.printf("The Base plus Commission employee is: %s%n", bCE);
    
        bCE.recordMonthlySales(300);
        bCE.recordMonthlySales(200);
        
        System.out.printf("%s%n", bCE.getPayCheck());
        
    }
}
