package ch06.list;

import com.myuniversity.students.Student;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
//  빈 List(ArrayList)를 생성하세요
        List<String> list = new ArrayList<String>();
//  List에 "사과", "바나나", "체리"를 순서대로 추가하세요.
        list.add("사과");
        list.add("바나나");
        list.add("체리");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("순서대로 추가한 것");

//  List에 있는 요소의 개수를 출력하세요.
        System.out.println(list.size());
        System.out.println("요소의 개수 출력");

//  List의 두 번째 요소를 출력하세요.
         System.out.println(list.get(1));
        System.out.println("2번째 요소 출력");

//  List에서 "바나나"를 제거하세요.
        list.remove(1);
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("바나나 제거");

//  List에 "딸기"를 추가하고, "사과"와 "딸기" 사이에 "오렌지"를 삽입하세요.
        list.add("딸기");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("딸기 추가");

        list.remove(1);
        list.add(1, new String ("오렌지"));
        list.add("체리");
        for (String name : list) {
            System.out.println(name);
        }

//  List에 있는 모든 요소를 출력하세요.
//    List변수.indexOf(객체)
        // 요소의 위치를 찾을 수 있음
//        for (String str : lstStr) {
//            System.out.println(lstStr.indexOf(str) + ": " + str);
//        System.out.println(str);

//        }
//  List가 비어 있는지 확인하세요.
        if(list.size() == 0) {
            System.out.println("리스트가 비어 있습니다.");
        } else {
            System.out.println("리스트에 요소가 있습니다.");
        }

//  List에 있는 요소들을 알파벳순으로 정렬하세요.
        Collections.sort(list);
        // 내부적으로 구버전 자바이면 merge-sort, 현재 자바면 tim-sort
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("알파벳순으로 정렬");

//  List에 있는 요소들 중에서 가장 긴 문자열을 찾아 출력하세요.
        String longestString = "";
        for (String name : list) {
            if (name.length() > longestString.length()) {
                longestString = name;
            }
        }
        System.out.println(longestString);

//  List에 있는 요소들 중에서 가장 짧은 문자열을 찾아 출력하세요.
//  List의 모든 요소를 대문자로 변환하세요.

//  List에 있는 요소들을 거꾸로 배치하세요.
        Collections.reverse(list);
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("거꾸로 배치");

//  List에 있는 "체리"가 있는지 확인하세요.
        boolean containsCherry = list.contains("체리");
        System.out.println(containsCherry);

//  List의 마지막 요소를 제거하세요.
        list.remove(list.size() - 1);



//        // 버블 정렬(임시저장 공간에 하나를 저장하고(swap))
//        java.util.List<Student> lstStudent = new ArrayList<Student>();

        List<Student> lstStudent = new ArrayList<Student>();
        lstStudent.add(new Student("조정빈"));
        lstStudent.add(new Student("남소나"));
        lstStudent.add(new Student("홍길빈"));

        Collections.sort(lstStudent);



        /*
        @ : at mark
        바로 만들 수 있는 방법
        클래스명::필드명(getter)   해당 클래스의 필드로 무언가를 하겠다.

        Collections.sort(lstStudent, Comparator.comparing(클래스명::필드명)
        Collections.sort(lstStudent, Comparator.comparing(Student::getName));
        for (Student s : lstStudent) {
        sout(s.getName());
        }
         */




    }
}
