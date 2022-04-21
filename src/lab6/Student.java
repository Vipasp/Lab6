package lab6;

public class Student {
    String firstName, lastName,group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }
    public int getScholarship(double averageMark){
        int scholarship=80;
        if (averageMark==5) scholarship=100;

        return  scholarship;
    }
}
