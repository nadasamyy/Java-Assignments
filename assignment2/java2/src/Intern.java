public class Intern extends employee {
    private int hoursWorked;
    private double hourlyRate;

    public Intern(String name, int id, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Intern");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}
