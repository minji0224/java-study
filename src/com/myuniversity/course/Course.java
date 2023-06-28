package com.myuniversity.course;

import com.myuniversity.students.GraduateStudent;
import com.myuniversity.students.Student;
import com.myuniversity.students.UndergraduateStudent;
// 다른 패키지에 있는 클래스를 가져다 쓰는 방법
// import 패키지명. ... 클래스명;
// import 패키지명 ...*;  // (잘안씀) 해당 패키지의 모든 클래스
// import com.myuniversity.students.Student.*; // 위 3개 모두 쓰고 싶을 때

public class Course {
    private String name;
    private Student[] students;          // 배열에 있는 변수명은 클래스명에 s 붙인 변수명이 좋음.


    /*
    final 변수
    상수(constant): 초기화만 가능하고, 변경 불가능한 값
    private int MAX_STUDENT = 20;   // 상수는 대문자 snake-case 많이 사용한다.
     */


    private int numOfStudents = 0;;  // 현재 과목에 몇명의 학생이 있는지(초기화)
    private int maxStudent = 20;    // 과목에 몇명의 학생이 참여 가능한지(초기화)
    private GraduateStudent[] graduateStudents;
    private UndergraduateStudent[] undergraduateStudents;


    public Course(String name, int maxStudent) {  // 초기화하는 중
        this.maxStudent = maxStudent;
        this.students = new Student[maxStudent];    // 학생 배열 객체를 생성한 것
    }


    // 해당 클래스에 학생이 참여(추가) 되는 것
    public void joinStudent(Student student) {
        this.students[numOfStudents] = student;
        numOfStudents++;
        System.out.println("--" + student.getName() +"학생이 추가되었습니다.");
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
}
