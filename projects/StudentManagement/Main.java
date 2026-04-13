package StudentManagement;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Zoe", 18);

        student1.setName("Bobby");
        student1.setAge(21);

        student2.setAge(12);

        Student.displayStudents();
        System.out.println("Total students: " + Student.showStrength());
    }
}
