package employee;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

    private double monthlySales, commissionRate;

    public CommissionEmployee(String firstName, String lastName, int sin, LocalDate dob, double comRate) {
        super(firstName, lastName, sin, dob);
        monthlySales = 0;
        setCommissionRate(comRate);

    }

    protected double getMonthlySales() {
        return monthlySales;
    }
    
    protected double getComRate() {
        return commissionRate;
    }
    
    public void setCommissionRate(double rate) {
        if (rate > 0 && rate < 60) {
            commissionRate = rate;
        } else {
            throw new IllegalArgumentException(" Commission rate must be in the range 1-60.");
        }
    }

    public void recordMonthlySales(double sales) {
        if (sales >= 0) {
            monthlySales += sales;
        } else {
            throw new IllegalArgumentException(" Sales must not be negative.");
        }
    }

    @Override
    public PayCheque getPayCheck() {

        double pay = monthlySales * commissionRate * 0.01;
        monthlySales = 0;
        PayCheque cheque = new PayCheque(super.toString(), "Sales Pay", pay);

        return cheque;
    }

}
