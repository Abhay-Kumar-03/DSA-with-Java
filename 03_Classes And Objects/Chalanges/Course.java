public class Course {

    static int maxNoOfStudents = 100;
    String studentName;
    String courseName;
    int  enrollments;

    String[] enrolledStudents;

//    static {
//        maxNoOfStudents--;
//    }
//
//    {
//        maxNoOfStudents++;
//    }

    Course(String courseName, String enrolledStudents){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents  = new String[maxNoOfStudents];
    }
//
//    Course(String courseName){
//        this(courseName,"Error");
//    }

    static void setMaxCapacity(int maxNoOfStudents){
        Course.maxNoOfStudents = maxNoOfStudents;
    }

    void enrolledStudents(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName){
        System.out.println("Student remove");
        enrollments--;
    }


}
