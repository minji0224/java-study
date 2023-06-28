package com.myuniversity.course;

// 학과 과목과 관련된 기능을 제공해주는 클래스

import ch05.accessModifier.Animal;

import java.util.Scanner;
// 다른 클래스도 끌어다 와야되는지?

public class CourseService {
    private Course[] courseList;   // 과목 목록을 저장하는 배열
    private int numCourse;         // 과목의 개수
    private Scanner scanner;  // 사용자 키보드 입력 객체

//
//    public createCourse(int maxSize) {    // 과목 생성 기능 매소드
//        courseList = new Course[maxSize];    //(맥스사이즈)과목 목록을 저장하는 배열 생성
//        numCourse = 0;                       // 현재 생성된 과목의 수
//        scanner = new Scanner(System.in);     // 사용자 입력 객체 생성
//    }
//
//    public void assignCourse(String name, Course students) { // 과목에 참여한 학생이름?수?/ 과목명
//        Course course = new Course(name, students);   // 이름과, 과목명을 입력받고
//        courseList[numCourse] = course; // 과목객체를 생성하고 배열의 가장 처음 빈 공간에 추가한다.
//        numCourse++;
//    }
//
//    public void showStudentsByCourseName () {  // 과목명과, 학생이름?수를 출력해야됨.
//        for ( Course.show : )
//    }




// 1. 과목 생성 기능(dreateCaourse)
//2. 과목에 참여 학생 추가 기능(assignCourse)
// 3. 과목에 참여한 학생 출력 기능(showStudentsByCourseName)
// 0. 프로그램 종료(무한반복 vreak)






//    // 서비스를 실행할 수 있는 run 매서드
//    // run매서드를 Main.main 매서드에서 실행하면 됨.
//    Animal animal = Animal();
//    public void test() {
//        // animal.eat();  (protected매서드는 다른 패키지에서 사용을 못함)
//    }
}
