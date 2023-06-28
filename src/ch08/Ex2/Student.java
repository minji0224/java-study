// src/com/university/students/Student.java

/*
이름 짓는 법
1. 회사(com), 비영리조직(org)
   com. ----
   org. ----
2. 회사명, 조직명,
   com.naver, com.woohan
   org.tje, org.mozilla
3. 제품명, 서비스명, 도메인명(비즈니스범위명)
   com.naver.search, dom.baver.blog, com.naver.news
4. 그 하위
   com.naver.news.sports.baseball

   package com.myuniversity.students;

 */

package ch08.Ex2;

// comparable 인터페이스를 구현한다.
// implements 실행한다.
// 자바 객체를 특정 필드로 정렬하는 방법
// java sort by specific field

// Comparable<Student> 도 인터페이스임 따라서 comparableTo로 구현해줘야 됨 Student로 구현해야됨. 제너릭

public class Student implements Comparable<Student>, Gradable, Studyable{
    private String name;
    private double score;


public Student(String name) {
    this.name = name;
}

public String getName() {
        return name;
    }

    @Override
    public String calculateGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    @Override
    public void study() {
        System.out.println("학생은 공부하셔야죵");
    }

    // comparable 인터페이스를 구현한다.
// implements 실행한다.
// 자바 객체를 특정 필드로 정렬하는 방법
// java sort by specific field
//  @Override
    public int compareTo(Student o) {
    return this.name.compareTo(o.name);
    }
    // 이후 다른 클래스에서 Collections.sort(리스트)를 쓰면
    // 객체별로 compareTo 매서드를 실행하여 정렬해줌


}

