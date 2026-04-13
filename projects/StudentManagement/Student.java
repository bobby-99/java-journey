package StudentManagement;

public class Student {
    private String name;
    private int age;

    static int studentCount = 0;
    static Student[] students = new Student[100];

    public Student() {
        this("Unknown", 0);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        students[studentCount] = this;
        studentCount += 1;
    }

    public static void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].name + " of age : " + students[i].age);
        }
    }

    public static int showStrength() {
        return studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}