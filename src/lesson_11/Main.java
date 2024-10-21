package lesson_11;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Alex", "Smith", "1520", 4);
        students[1] = new Aspirant("Larisa", "Black", "2214", 4.4, "Design");
        for(Student student : students){
            System.out.println(student.getScholarship());
        };
    }
}
