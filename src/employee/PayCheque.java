package employee;

import java.time.LocalDate;

class PayCheque {

    private String employeeName, notes;
    private LocalDate dateIssued;
    private double amount;
    private int chequeNumber;

    private static int nextChequeNumber = 1000;

    public PayCheque(String employeeName, String notes, double amount) {
        this.employeeName = employeeName;
        this.notes = notes;
        setPayAmount(amount);
        dateIssued = LocalDate.now();
        
        chequeNumber = nextChequeNumber++;
    }

    private void setPayAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            throw new IllegalArgumentException(" Pay amounts must be greater than 0.");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNotes() {
        return notes;
    }

    public LocalDate getDateIssued() {
        return dateIssued;
    }

    public double getAmount() {
        return amount;
    }

    public int getChequeNumber() {
        return chequeNumber;
    }

    @Override
    public String toString() {
        return String.format("Cheque#: %d%nTo: %s%nAmount: %.2f%nDate: %s%n", chequeNumber, employeeName, amount, dateIssued);
    }

}
