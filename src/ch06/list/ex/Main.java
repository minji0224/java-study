package ch06.list.ex;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        // 해쉬맵을 학번(키), Student클래스의 객체(값)를 students로 쓰겠다고 선언 및 생성


        students.put("0000001", new Student("최민지", 22));    // 생성한 해쉬맵에 학생 5명 추가
        students.put("0000002", new Student("한상혁", 24));
        students.put("0000003", new Student("유진아", 23));
        students.put("0000004", new Student("홍길동", 22));
        students.put("0000005", new Student("동길홍", 26));


        students.remove("0000004");   // 특정 키값 객체 삭제

        // 문제 3: 맵에서 특정 학번의 학생을 검색하는 코드를 작성하세요.
//        System.out.println(students.get("0000001"));                 // 특정 키값 객체 조회

//        Student s = students.get("0000001");
//        System.out.println(s);                          // 위 포함 2개 코드는 주?소값을 보여줌.

        String studentKey = "0000001";
        Student student = students.get(studentKey);
        if (studentKey != null) {                           //  출력하는 코드를 따로 작성해야됨.
            System.out.println("학번: " + studentKey + "\n이름: " + students.get(studentKey).getName() +
                    "\n나이: " + students.get(studentKey).getAge());
        } else {
            System.out.println("존재하지 않는 학번입니다.");      // 엘스를 꼭 넣어야 되는지?
        }


        // 해쉬맵의 키(학번)의 타입 String과 변수명 key1 : 맵변수명.keySet()
        for (String key1 : students.keySet()) {  //맵변수명.keySet()은 key목록을 반환한다
            System.out.println("학번: " + key1 + ", 학생명: " + students.get(key1).getName() + ", 나이: " +
                    students.get(key1).getAge());
        }

//       학생들의 나이 평균을 계산하는 코드를 작성하세요.
//          for ( Student age1 = students.values()) {   // 맵에 있는 값을 나이만 뽑아서 합산해야되는데,,,
//               = age1.getAge();
//          }
        double totalAge = 0;
        for (Student studentAge : students.values()) {  // 리스트에 있는 값 가져와서
            totalAge += studentAge.getAge();            // 향상된 포문에 사용된 변수에 담긴 에이지 특정하기
        }
        double averageAge = totalAge / students.size();
        System.out.println(averageAge);


        // 문제 7: 문제 2에서 생성한 맵에 있는 학생들 중 가장 나이가 많은 학생을 찾는 코드를 작성하세요.

        // int 변수를 맥스사이즈로 정하고 -> 에이지값을 맥스사이즈보다 크게 만들어야하나?
        // || 연산자?

//        Student oldestStudent = null;
//        for (Student studentOld : students.values()) {
//            if (oldestStudent == null || student.age > oldestStudent.age) {
//                oldestStudent = studentOld;
//            }
//        }
//        System.out.println(oldestStudent);      // 왜 또 주소값이 떠요?
//          System.out.println(students.get(oldestStudent).getAge());   // 이건 오류떠요



//        int i = 0;
//        for (Student s : students.values()) {
//            if (i >= s.getAge()) {
//                System.out.println(s.getAge());
//            }
//        }



        // 문제 8: 학생들의 이름을 알파벳 순서로 정렬하여 출력하는 코드를 작성하세요
          // 맵(k v) -> 벨류 리스트로 바꾼다음에 (선언)
          List<Student> studentList = new ArrayList<>(students.values());
          // 정렬하기 컬렉션솔트로하기
          Collections.sort(studentList, Comparator.comparing(Student::getName));
          // 출력하기
          for(Student std : studentList) {
              System.out.println(std.getName());
          }






//        for (Student abc : new TreeMap<>(students).values()) {
//            System.out.println("학번: " + !!!!! + ", 이름: " + students.get(abc).getName() + ", 나이: " +
//                    students.get(abc).getAge());
//        }

//
//문제 9: 문제 2에서 생성한 맵에서 학생들의 이름에 특정 문자열이 포함되어 있는 경우만 출력하는 코드를 작성하세요.
//
//문제 10: 문제 2에서 생성한 맵에 특정 이름의 학생이 있는지 확인하는 코드를 작성하세요.







        /* 비교하기 / 스튜던트 클래스에비교구문넣기
        맵 자체를 정렬하고
        벨류 클래스가 컴페러블 구현한 상태여야 함
        Stream<Map.Entry<String, Student>> sortdeStudent =
        students.entrySet().stream()
        .sortde(Map.Entry.comparingByValue());

        for(Map.Entry<String, Student> std: sortedStudent.toList()) {
        sout(std.getValue().getName())
        }
         */








    }
}

