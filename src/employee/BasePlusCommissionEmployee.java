package employee;

import java.time.LocalDate;

/**
 *
 * @author ASingh
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, int sin, LocalDate dob, double comRate, double baseSalary) {
        super(firstName, lastName, sin, dob, comRate);
        setBaseSalary(baseSalary);
    }
    
    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException(" Base salary must be positive.");
        }
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }
    
    public PayCheque getPayCheque() {
        
        double salary = baseSalary + (super.getComRate() * super.getMonthlySales()/100);
        PayCheque cheque = new PayCheque(super.toString(), " base salary", salary);
        
        return cheque;
    }
}
