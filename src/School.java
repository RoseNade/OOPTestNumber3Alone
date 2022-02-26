import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    public School(int len) {
        this.classRooms = new ClassRoom[len];
        for (int i = 0; i < len; i++) {
            classRooms[i] = FactoryUtils.initClassRoom();
        }
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "classRoom" + Arrays.toString(classRooms);
    }
}
