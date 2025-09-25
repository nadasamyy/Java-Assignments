public class manager extends employee {
    private double bonus;

    public manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Manager");
        System.out.println("Bonus: " + bonus);
    }
}
