package ch09;

import ch07.CourseEx.Course;
import ch08.Ex2.Account;
import ch08.Ex2.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List: 인터페이스, ArrayList: 구현클래스
        // <String> : 매개변수를 타입(클래스)으로 넣었다.
        // 매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭(제너릭, 쥐네릭)
        // 제너릭을 쓸 수 있는 상황은
        // 연산이나 로직이 같고, 메서드명, 매개변수 개수도 같지만 타입만 다를 때

        List<String> list = new ArrayList<>();
        // 1. 타입을 컴파일 타임(코드짜는중)에 체크할 수 있다(타입의 안정성 보장).
        list.add("aaaa");
        // list.add(1);  // 에러발생, generic으로 String을 넣었기 때문에 Integer는 안됨

        for(Object s : list) {
            String str = s.toString();
            str.toUpperCase();
        }



        GenericStack<String> stack = new GenericStack<>();
        GenericStack<Student> stackStudents = new GenericStack<Student>();
        GenericStack<Course> stackcourses = new GenericStack<Course>();
        GenericStack<Account> stackAccounts = new GenericStack<Account>();




        // list는 String, Integer, Double...
        // 기능을 타입(클래스)별로 만들지 않아도 됨.
        // 2. 코드를 타입 매개변수를 가지고 쉽게 재사용 가능함.
        List<Integer> lstNum = new ArrayList<>();
        lstNum.add(1);
        lstNum.add(2);
        lstNum.add(3);


        /*
        Util<타입> util = new Util();
        public T add(T a, T b)

        Util<Integer>                // 정수에 처리를 해주는 기능을 제공
        Util.add(3, 4)

        Utill<String>                // 문자열에 처리를 해주는 기능을 제공
        util.add("fdfd", "fddd")


        오버로딩으로 이용하려면 :
        Util<타입> util = new Util();
        add(Integer a, Integer b)
        add(String a, String b)          // 이런식으로 타입에 맞게 메소드를 일일히 만들어 줘야함.
         */



        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
