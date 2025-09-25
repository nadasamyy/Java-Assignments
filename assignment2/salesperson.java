public class salesperson extends employee {
    private double commission;

    public salesperson(String name, int id, double baseSalary, double commission) {
        super(name, id, baseSalary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: SalesPerson");
        System.out.println("Commission: " + commission);
    }
}
