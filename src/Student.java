import java.util.Arrays;

public class Student extends Person{
    private Grade[] grades;

    public Student(String name, int len) {
        super(name);
        this.grades = new Grade[len];
        for (int i = 0; i < len; i++) {
            grades[i] = new Grade(Profession.values()[i]);
        }
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Grades" + Arrays.toString(grades) + ", " + super.toString();
    }
}