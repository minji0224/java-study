package ch06.set;

import com.myuniversity.students.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("양수열");
//        Student s2 = new Student("박재욱");
//        Student s3 = s1;
//        Student s4 = new Student("홍길동");
//
//
//        // hashCode: 같은 참조면 같은 값
//        System.out.println("s1: " + s1.hashCode());
//        System.out.println("s2: " + s2.hashCode());
//        System.out.println("s3: " + s3.hashCode());
//        System.out.println("s4: " + s4.hashCode());
//
//
//        //equals: 기본적으로 같은 참조면 true이나, 바꿀 수 있다.
//        System.out.println(s1.equals(s3));
//
//        // 객체 추가
//        Set<String> sets = new HashSet<>();
//        sets.add("apple");
//        sets.add("banana");
//        sets.add("cherry");
//        sets.add("durian");
//        sets.add("elderberry");
//
//        // 객체 탐색/조회하는 법
//        for(String s : sets) {
//            System.out.println(s);
//        }
//
//        // contains
//        // 해당 값이 있는지 확인하는 법
//        System.out.println(sets.contains("cherry"));
//
//
//        // 삭제
//        // 해당 값이 있으면 지운다.
//        sets.remove("cherry");

        List<String> lst = new ArrayList<>();
        lst.add("apple");
        lst.add("banana");
        lst.add("cherry");
        lst.add("banana");
        lst.add("durian");
        lst.add("elderberry");
        lst.add("banana");

        for (String s : lst) {
            System.out.println(s);
        }
        System.out.println("--------------------------");


        // 중복된 목록 제거하는 법
        // 해쉬셋 생성자에 자료구조 넣은 것
        // 해쉬셋 말고 트리셋으로 하면 중복제거 및 정렬도 해줌
        // 컬렉션(리스트) -> set으로 초기화 생성
        Set<String> set2 = new TreeSet<>(lst);
        for ( String s : set2) {
            System.out.println(s);
        }
        System.out.println("--------------------------");




    }
}
