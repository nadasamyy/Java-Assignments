import java.util.*;

public class Main {
    private LinkedHashMap<Integer, employee> employees = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Business Employee Management System ---");
            System.out.println("1. Add Manager");
            System.out.println("2. Add SalesPerson");
            System.out.println("3. Add Intern");
            System.out.println("4. View All Employees");
            System.out.println("5. View Total Payroll");
            System.out.println("0. Exit");

            int choice = readInt("Choose an option: ");
            switch (choice) {
                case 1 -> addManager();
                case 2 -> addSalesPerson();
                case 3 -> addIntern();
                case 4 -> viewAllEmployees();
                case 5 -> viewTotalPayroll();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private void addManager() {
        String name = readString("Enter name: ");
        int id = readInt("Enter ID: ");
        double baseSalary = readDouble("Enter base salary: ");
        double bonus = readDouble("Enter bonus: ");
        employees.put(id, new manager(name, id, baseSalary, bonus));
        System.out.println("Manager added.");
    }

    private void addSalesPerson() {
        String name = readString("Enter name: ");
        int id = readInt("Enter ID: ");
        double baseSalary = readDouble("Enter base salary: ");
        double commission = readDouble("Enter commission: ");
        employees.put(id, new salesperson(name, id, baseSalary, commission));
        System.out.println("SalesPerson added.");
    }

    private void addIntern() {
        String name = readString("Enter name: ");
        int id = readInt("Enter ID: ");
        double baseSalary = readDouble("Enter base salary: ");
        int hours = readInt("Enter hours worked: ");
        double rate = readDouble("Enter hourly rate: ");
        employees.put(id, new Intern(name, id, baseSalary, hours, rate));
        System.out.println("Intern added.");
    }

    private void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\nEmployees list:");
        for (employee e : employees.values()) {
            System.out.println("----------------------------");
            e.displayInfo();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println("----------------------------\n");
        }
    }

    private void viewTotalPayroll() {
        double total = 0.0;
        for (employee e : employees.values()) {
            total += e.calculateSalary();
        }
        System.out.println("Total payroll: " + total);
    }

    // Input helpers
    private int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = scanner.nextLine();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String line = scanner.nextLine();
                return Double.parseDouble(line.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number. Please try again.");
            }
        }
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
