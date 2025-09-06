import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];  // store 3 students

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter grade 1: ");
            float g1 = sc.nextFloat();

            System.out.print("Enter grade 2: ");
            float g2 = sc.nextFloat();

            System.out.print("Enter grade 3: ");
            float g3 = sc.nextFloat();

            sc.nextLine(); // clear buffer

            // Create Student object
            students[i] = new Student(name, id, g1, g2, g3);
        }

        // Show results
        System.out.println("\n=== Results ===");
        for (Student s : students) {
            s.displayInfo();
        }

        sc.close();
    }
}
