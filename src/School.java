import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    public School(int len) {
        this.classRooms = new ClassRoom[len];
        for (int i = 0; i < len; i++) {
            classRooms[i] = FactoryUtils.initClassRoom();
        }
    }

//    public void classProfessionAvg(){
//        double result = 0;
//        int count = 0;
//        for (int i = 0; i < Profession.values().length; i++) {
//            System.out.println(Profession.values()[i] + " and the school average of it is:");
//            for (int j = 0; j < this.classRooms[i].getStudents().length; j++) {
//                result += this.students[j].getGrades()[i].getScore();
//                count++;
//            }
//            System.out.print(result / count + '\n');
//            result = 0;
//            count = 0;
//        }
//    }

    public double getAvg(){
        double result = 0;
        int count = 0;
        for (ClassRoom classRoom : this.classRooms) {
            result += classRoom.getAvg();
            count++;
        }
        return result / count;
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
