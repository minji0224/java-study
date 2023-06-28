package ch07;

import ch07.CourseEx.CourseManager;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("고대근", 39);
        p.introduce();
        System.out.println();
        Student s = new Student("고대근", 39,"000001");
        s.introduce();
        System.out.println();
        s.study();



        // 업캐스팅
        // Student 객체를 person 타임으로 변환(부모타입으로 변환)
        // 자식 객체를 부모 객체에 대입
        Person p2 = s;
        // 부모 객체의 자식 객체에서 재정의된 메서드를 호출하면 자식 객체의 메서드가 호출
//        p2.work();   // Student에 study()
        p2.introduce(); // Student의 introduce가 호출되었음.

        // 자식 객체의 추가한 메서드/필드는 접근불가
        // p2.study()   // 호출 불가

        Person p3 = new Lecturer("고대근", 5, 5);
//        p3.work(); // Lecturer에 teach()





        // 부모 객체를 자식 객체에 대입하는 법
        // 명시적 형변환으로 가능 (데이터타입)
        // 그냥 형변환 하면 에러발생 가능성 존재
        // 부모객체변수 instanceof 자식클래스타입    -> 연산자이다.
        // Student -> Person, Person, Lecturer -> Student
        if (p2 instanceof Student){
            Student s2 = (Student) p2;
            s2.study();
        }
                                        // 이것들은 연산자임

        if (p3 instanceof Student){
        Student s3 = (Student) p3;
        s3.study();
        } else {
            System.out.println("");
        }

        System.out.println("------------------------------");


        // 여기 수학은 왜 안뜨는지?
        CourseManager a = new CourseManager("수학", 101, "고대근");
        a.addCourse("국어",102, "강태민");
        a.addCourse("영어",103,"최재경","플랫폼?");
        a.addCourse("사회",104,"김동길",302,4);
        a.addCourse("도덕",105,"박길홍",403,2);
        a.printCourses();


    }



}


