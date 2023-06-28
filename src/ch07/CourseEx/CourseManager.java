package ch07.CourseEx;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//코스클래스를 가져와야하는지
public class CourseManager extends Course {
    List<Course> courses;    // Course 리스르 생성
    private Scanner scanner;

    public CourseManager(String courseName, int courseCode, String instructor) {
        super(courseName, courseCode, instructor);
        courses = new ArrayList<Course>();  // Course 리스르 객체생성
        scanner = new Scanner(System.in);
    }
    public void addCourse(String courseName, int courseCode, String instructor) { // 배열에 추가하는 메서드
        Course acc = new Course(courseName, courseCode, instructor);
        courses.add(acc);
    }
    // 오버로딩 하는 중
    // 리스트에 콜스클래스, 온라인클래스, 렉처클래스의 리스트를 만들어야 되니깐 우선 오버로딩으로 만들고
    // 결국엔 호출할 땐 리스트에는 콜스객체만 호출가능하고, 자식 클래스에 있는 추가된 객체들은 형변환으로 가져와야 함
    public void addCourse(String courseName, int courseCode, String instructor,String platform) {
        Course acc = new OnlineCourse(courseName, courseCode, instructor, platform);
        courses.add(acc);
    }
    public void addCourse(String courseName, int courseCode, String instructor,int room, int time) {
        Course acc = new LectureCourse(courseName, courseCode, instructor, room, time);
        courses.add(acc);
    }
    // 이렇게 할때 리스트에 다 저장되는지 궁금


//     if문으로 instanceof를 써서 자식클래스들을 찾고 거기에 맞게 형변환을 해준 식
//                } else if (agg instanceof LectureCourse) {
//                   ((LectureCourse) agg).showCourse();
//              } else {
//                  agg.showCourse();
//              }
//     나는 이런식으로 했는데 출력이 안돼서 아래로 코드 바꿈(형변환해서 showCourse를 보여주지 않음)
//    여기서 왜 get으로 쓰는지 get과 showCourse의 차이점
    public void printCourses() {
        for (Course agg : courses) {
            if (agg instanceof OnlineCourse) {
                OnlineCourse reOnlinCourse = (OnlineCourse) agg;
                System.out.println("이름은 : " + reOnlinCourse.getCourseName() + ", 코드는 : " + reOnlinCourse.getCourseCode() + ", 강사는 : " +
                        reOnlinCourse.getInstructor() + ", 플랫폼은 : " + reOnlinCourse.getPlatform());
            } else if (agg instanceof LectureCourse) {
                                LectureCourse reLectureCourse = (LectureCourse) agg;
                        System.out.println("이름은 : " + reLectureCourse.getCourseName() + ", 코드는 : " +
                                reLectureCourse.getCourseCode() + ", 강사는 : " +
                                reLectureCourse.getInstructor() + ", 강의실은: " + reLectureCourse.getRoom()
                                + ", 강의시간은 : " + reLectureCourse.getTime());
                    } else {
                System.out.println("이름은 : " + agg.getCourseName() + ", 코드는 : " + agg.getCourseCode()
                        + ", 강사는 : " + agg.getInstructor());
                }
        }
    }

    public Course getCourseByInstructor(String instructor) {
        for (Course cou : courses) {
            if (cou.getInstructor().equals(instructor)){
                return cou;
            }
        }
        return null;
    }



}

