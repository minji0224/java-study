package ch06.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List<자료형> 변수형 = new ArrayList<자료형>();
        // 자료형에 따라서 다르게 작동하기 위해서 추가적인 매개변수를 <자료형>을 넣는다.
        // 자료형을 매개변수로 받는 것을 제너릭/제네릭/쥐네릭(generic)
        // 매개변수의 자료형은 기본(원시) 자료형(primitive type)은 안 됨(int/lont...x)
        // Integer, Long 클래스 타입을 넣어줘야한다.

        List<String> list = new ArrayList<String>();
        // List<String> list = new LinkList<String>();  링크리스트로 바꾸는 법
        List<Integer> listInt = new ArrayList<Integer>();


        // 객체 추가하는 방법
        // 리스트변수, add(객체);


        list.add("남소나");         // 대입문 안쓰고 add로 바로 추가함
        list.add(new String("명승정"));          // 둘다 객체임
        for (String name : list) {
            System.out.println(name);
        }

        // 특정 위치의 값을 변경하는 법
        list.set(0, "조정빈");
        list.set(1, "이현미");
        for (String name : list) {
            System.out.println(name);
        }


        // 리스트변수.size() - 요소의 개수
        System.out.println(list.size());
        System.out.println("---------------------");




        list.add("김성우");
        list.add("김소현");
        for(String name : list) {
            System.out.println(name);
        }


        System.out.println("---------------------");

        list.remove(1);     // 변수 제거
        // 뒤에 있는 것을 전부 당겨와서 중간의 구멍(null)이 안 생김.
        for (String name : list) {
            System.out.println(name);
        }



        System.out.println("---------------------");
        // 2번 객체에 삽입
        list.add(2, new String("이현미"));
        for (String name : list) {
            System.out.println(name);
        }
        // 이렇게 중간에 요소를 삭제하거나, 추가하게 되면
        // 뒤쪽요소를 당겨오거나 밀어야되는 overhead(추가적인 연산) 발생
        // 이런 케이스가 잦다면, ArrayList -> LinkList로 바꿔야 함.
        // List<String> list = new LinkList<String>(); 요렇게
        /*
                        요소추가,   전체 탐색,    요소삭제/삽입
         ArrayList        빠름       빠름          느림(많이)
         LinkedList       느림       느림          빠름

         */

    }
}
