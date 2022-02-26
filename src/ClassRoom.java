import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students;

    public ClassRoom(String name, int studentsInClass) {
        this.name = name;
        this.teacher = FactoryUtils.initTeacher();
        this.students = new Student[studentsInClass];
        for (int i = 0; i < studentsInClass; i++) {
            students[i] = FactoryUtils.initStudent();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Name:" + name + '\'' + ", teacher:" + teacher + ", students:" + Arrays.toString(students) + '\n';
    }
}
