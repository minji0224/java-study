package ch07.CourseEx;

public class Course {
    String courseName;
    int courseCode;
    String instructor;

    public Course(String courseName, int courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    public void showCourse() {
        System.out.println("과목명: " + courseName + ", 과목코드: " + courseCode + ", 강사명: " + instructor);
    }
}


