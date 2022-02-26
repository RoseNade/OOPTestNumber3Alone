public class SchoolStatistics {
    public static void main(String[] args) {
        
    }

    public static double schoolAvg(School school){
        double result = 0;
        for (int i = 0; i < school.getClassRooms().length; i++) {
            result += classAvg(school.getClassRooms()[i]);
        }
        System.out.println("The school average is:");
        return result;
    }

    // exercise 2?
    public static double classAvg(ClassRoom classRoom){
        System.out.println(classRoom.getName());
        double result = 0;
        int count = 0;
        for (int i = 0; i < classRoom.getStudents().length; i++) {
            for (int j = 0; j < classRoom.getStudents()[i].getGrades().length; j++) {
                result += classRoom.getStudents()[i].getGrades()[j].getScore();
                count++;
            }
        }
        System.out.print("The class average is:");
        return result / count;
    }


    public static double eachSubjectAvg(School school){
        int result = 0;
        int count = 0;
        for (int i = 0; i < Profession.values().length; i++) {
            result = 0;
            count = 0;
            System.out.println("Profession: " + Profession.values()[i]);
            for (int j = 0; j < school.getClassRooms().length; j++) { // how many classrooms in the school
                for (int k = 0; k < school.getClassRooms()[j].getStudents().length; k++) { // how many students in each class
                    for (int l = 0; l < school.getClassRooms()[j].getStudents()[k].getGrades().length; l++) { // how many grades are there
                        result += school.getClassRooms()[j].getStudents()[k].getGrades()[l].getScore();
                        count++;
                    }
                }
            }
        }
        return result / count;
    }
}
