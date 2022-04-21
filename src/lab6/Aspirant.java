package lab6;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }


    @Override
    public  int getScholarship(double averageMark){
        int scholarship=180;
        if (averageMark==5) scholarship=200;

        return  scholarship;
    }
    public static void main(String[] args) {
        Student student = new Aspirant("Иван","Петров","Group1",5,"Work1");
        //
        System.out.println(student.getScholarship(student.averageMark));
    }
}
