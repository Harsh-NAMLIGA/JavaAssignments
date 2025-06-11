class Student {
    String name;
    int mark1, mark2, mark3;

    void calculateAverage() {
        int total = mark1 + mark2 + mark3;     // local variable
        double average = total / 3.0;           // local variable
        System.out.println(name + "'s Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Harsha";
        s.mark1 = 85;
        s.mark2 = 90;
        s.mark3 = 80;

        s.calculateAverage();
    }
}