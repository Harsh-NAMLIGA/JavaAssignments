class Employee1 {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    void setDetails(int id, String empName, double sal) {
        empId = id;
        name = empName;
        salary = sal;

        totalEmployees++;
        totalSalaryExpense += salary;
    }

    void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setDetails(1, "Harsha", 50000);
        Employee1 e2 = new Employee1();
        e2.setDetails(2, "Ravi", 60000);

        e1.display();
        e2.display();

        System.out.println("Total Embgghhgployees: " + totalEmployees);
        System.out.println("Total Salary Expense: " + totalSalaryExpense);
    }
}