package employee;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private final double MIN_WAGE = 11.40;

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, int sin, LocalDate dob, double rate) {
        super(firstName, lastName, sin, dob);
        hoursWorked = 0;
        setHourlyRate(rate);
    }

    public void setHourlyRate(double rate) {
        if (rate >= MIN_WAGE) {
            hourlyRate = rate;
        } else {
            throw new IllegalArgumentException(" Hourly wage should be at least " + MIN_WAGE);
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void recordHoursWorked(double newHours) {
        if (newHours >= 1 && newHours <= 16) {
            hoursWorked += newHours;
        } else {
            throw new IllegalArgumentException(" Hours must be in range 1-16.");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public PayCheque getPayCheck() {
        double payAmount = hourlyRate * hoursWorked;
        hoursWorked = 0;
        PayCheque cheque = new PayCheque(super.toString(), "Hourly pay", payAmount);
        return cheque;
    }

}
