package ch07.CourseEx;

public class LectureCourse extends Course {
    int room;
    int time;

    public LectureCourse(String courseName, int courseCode, String instructor, int room, int time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public int getRoom() {
        return room;
    }

    public int getTime() {
        return time;
    }

    @Override
    public void showCourse() {
        super.showCourse();
        System.out.println("강의실은 " + room +"호이고, 강의시간은 " + time + "입니다.");
    }
}
