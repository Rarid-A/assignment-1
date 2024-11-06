import java.text.DecimalFormat;

public class PaymentSlip {
    // Attributes: name, hourlyRate, hoursWorked
    private String name;
    private int hourlyRate;
    private int hoursWorked;
    private final double TAX_RATE = 0.30;
    //Constructor without paramaters
    public PaymentSlip() {
    
    }
    // Constructor to initialize the attributes
    public PaymentSlip(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
// getter and setter methods for the all attribute
    public String getName() {
        return name;
    
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // Method to calculate the salary before tax
    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Method to calculate net salary after 30% tax
        public String calculateNetSalary() {
            double salary = calculateSalary();
            double netSalary = salary - (salary * TAX_RATE);
            DecimalFormat df = new DecimalFormat("##.#");
            return df.format(netSalary);
    }
}
