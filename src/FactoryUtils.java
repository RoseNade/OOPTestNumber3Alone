public class FactoryUtils {
    private static int studentCount = 1;
    private static int teacherCount = 1;
    private static int classCount = 1;

    public static int ranNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static Student initStudent() {
        return new Student("Student " + studentCount++, 6);
    }

    public static Teacher initTeacher() {
        return new Teacher("Teacher " + teacherCount++);
    }

    public static ClassRoom initClassRoom() {
        return new ClassRoom("Class " + classCount++, 15);
    }
}