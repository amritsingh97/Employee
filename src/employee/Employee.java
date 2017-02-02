package employee;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {

    private final String firstName, lastName;
    private final int sin;
    private LocalDate birthdate;
    
    public Employee (String firstName, String lastName, int sin, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sin = sin;
        setBirthdate(dob);
    }
    
    private void setBirthdate (LocalDate dob) {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        if (age >= 15 && age <= 90){
            this.birthdate = dob;
        } else {
            throw new IllegalArgumentException(" Employee must be 15-90 old.");
        }
       
    }
    
    @Override
    public String toString () {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }
    
    public int getSin() {
        return sin;
    }
    
    public LocalDate getBirthdate () {
        return birthdate;
    }
    
    public abstract PayCheque getPayCheck();
}


