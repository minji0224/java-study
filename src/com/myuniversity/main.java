package com.myuniversity;

import com.myuniversity.course.Course;
import com.myuniversity.students.Student;

public class main {
    public static void main(String[] args) {
        Course c = new Course("자바, 고급프로그래밍", 14);
        c.joinStudent(new Student("최민지"));
        c.joinStudent(new Student("홍길동"));

        System.out.println("참가한 학생");
        // 참가한 학생 목록 꺼내오기
        Student[] students = c.getStudents();
        for ( int i = 0; i < c.getNumOfStudents(); i++) {
            System.out.println(students[i].getName());
        }
    }
}
