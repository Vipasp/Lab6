package lab6;

public class Main {
    public static void main(String[] args) {
        Student student = new Aspirant("Иван", "Петров", "Group1", 4.5, "Work1");
        Aspirant aspirant = new Aspirant("Антон", "Иванов", "Group2", 5, "Work2");
        Student student1 = new Student("Алла", "Борисова", "Group3", 4);
        Student[] students = {student,student1, aspirant};
        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
