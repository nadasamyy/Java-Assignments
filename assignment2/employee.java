public abstract class employee {
    private String name;
    private int id;
    private double baseSalary;

    public employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
