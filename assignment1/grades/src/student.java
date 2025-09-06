class Student {
    String name;
    int id;
    float grade1, grade2, grade3;

    // Constructor
    public Student(String name, int id, float grade1, float grade2, float grade3) {
        this.name = name;
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    // Method to calculate average
    public float calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    // Method to check pass/fail
    public boolean isPassed() {
        return calculateAverage() >= 50;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + (isPassed() ? "Passed" : "Failed"));
        System.out.println("----------------------");
    }
}
