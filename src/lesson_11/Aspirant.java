package lesson_11;

public class Aspirant extends Student{
   private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (Math.round(this.averageMark) == 5) {
            return 2500;
        }
        return 2200;
    }
}
