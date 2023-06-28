package ch07;


// 인간 정보
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 개인정보 출력
    public void introduce() {
        System.out.println("안녕하세요. 제 이름은 " + name +"이고, 나이는 " + age + "입니다.");
    }


    // 다향성을 이용해서
    // 현재 객체가 Student일 수도 있고, Lecturer일 수도 있다.

}
