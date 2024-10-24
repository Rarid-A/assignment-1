import java.text.DecimalFormat;

public class PaymentSlip {
    // Attributes: name, hourlyRate, hoursWorked
    private final String name;
    private final int hourlyRate;
    private final int hoursWorked;

    // Constructor to initialize the attributes
    public PaymentSlip(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
// getter and setter methods for the name attribute
    public String getName() {
        return name;
    }
    // Method to calculate the salary before tax
    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Method to calculate net salary after 30% tax
        public String calculateNetSalary() {
            double salary = calculateSalary();
            double netSalary = salary - (salary * 0.30);
            DecimalFormat df = new DecimalFormat("##.#");
            return df.format(netSalary);
    }
}
