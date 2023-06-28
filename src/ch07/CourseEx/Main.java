package ch07.CourseEx;

public class Main {
    public static void main(String[] args) {

        Course a1 = new Course("수학", 001, "고대근");
        a1.showCourse();

        OnlineCourse a2 = new OnlineCourse("국어", 002, "최태민", "플랫폼");
        a2.showCourse();

        LectureCourse a3 = new LectureCourse("영어", 003, "김재경", 302,4);
        a3.showCourse();



    }
}
