package ch06.map;

import com.myuniversity.students.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        // 해시맵은 추가할 때 정렬을 안함 (대신 성능은 좀 더 좋다)
        // 트리맵은 추가할 때 키값을 이진트리로 정렬(대신 성능이 떨어진다)


        // 객체 추가
        // 키(key 유일값): 학번
        // 값(value): 학생정보
        // 맵변수.put(엔트리(K, V))
        students.put("e-01-00001", new Student("강애진"));
        students.put("e-01-00002", new Student("김소현"));
        students.put("e-01-00003", new Student("김성우"));

        // 객체검색,조회
        // 맵변수명.keySet() -> key 목록을 반환함(키는 중복 안됨)
        // Set: 자료구조에서의 set은 집합, 원소의 중복이 없는 자료구조
        // 일반적으로 Map, 연관배열, dictionary, key - value pair 자료구조는 정렬해서 저장하지 않음.
        for (String key : students.keySet()) {
            // 맵변수.get(키값) -> 값 객체
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
        }

        // 키 값 존재여부 확인
        boolean result = students.containsKey("e-01-000005");

        // 맵변수.values() -> 값 목록을 반환함
        for (Student s : students.values()) {
            System.out.println(s.getName());
        }


        // 해시맵을 정렬된 트리맵으로 변환
//        Map<String, Student> sortedStudent = new TreeMap<>(students);
        for (String key : new TreeMap<>(students).keySet()) {
            System.out.println("학번: " + key + ", 학생명: " + students.get(key).getName());
        }



        // 객체의 값 수정
        // 맵변수.get(키값): 키값으로 조회 후 무언가를 처리할 수 있음
        Student s = students.get("e-01-00002");
        //setter로 값 수정(스튜던트클래스에 셋이 없어서 못만들었음;;


        // 객체 삭제
        // 맵변수.remove(키값): 특정 키값의 엔트리(key-value쌍)를 삭제
        students.remove("e-01-00003");

        // 모두 다 삭제하는 것
        students.clear();
    }
}
