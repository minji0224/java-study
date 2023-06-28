package ch07.CourseEx;

public class OnlineCourse extends Course {
    String platform;

    public OnlineCourse (String courseName, int courseCode, String instructor, String platform) {
        super(courseName, courseCode, instructor);
        this.platform = platform;
    }
    public String getPlatform() {
        return this.platform;
    }
    public void showCourse() {
        super.showCourse();
        System.out.println("플랫폼은 " + platform +"입니다.");
    }

}
