class CollegeStudent {
    int studentId;
    String studentName;
    static String collegeName = "ABC University";

    void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("College: " + collegeName);
    }

    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent();
        s1.studentId = 101;
        s1.studentName = "Harsha";

        CollegeStudent s2 = new CollegeStudent();
        s2.studentId = 102;
        s2.studentName = "Ravi";

        s1.display();
        s2.display();
    }
}
