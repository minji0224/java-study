package ch07;

// extends 부모클래스
// 부모클래스의 필드 및 메서드를 상속 받는다.
// inheritance(상속): 프로그래밍언어에서 상속은 자식이 부모를 선택해서 물려 받음.
// SE(SW공학) -> generaliaion(일반화) -> 자바에서는 inheritance(상속)라고 함
/*
상속의 개념
여러 개의 클래스를 구현하려 할 때, 일반적인 속성(attribute)과 기능(operation)이 있어서 -
그것을 부모 클래스로 만들고, 나머지 클래스들은 상속받고 필요한 것만 추가하자
 */
public class Student extends Person {
    // 부모의 필드 외에 다른 필드를 추가했다.
    // Student는 name, age 필드, introduce()라는 매서드를 그냥 사용할 수 있다.
    private String studentId;  // 학번을 추가

    // 빈 생성자는 자동으로 상속받음
    // 그러나 (클래스의)매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야 함.
    public Student(String name, int age, String studentId){
        // 웬만하면 클래스매개변수 순서를 맞춰주고 뒤에 추가를 넣어준다

        // super(...); 부모의 생성자를 호출    // super==부모
        // 실제로 부모 객체도 생성이 됨.
        super(name, age);   // 매개변수 순서에 맞게 써줘야 함.
        this.studentId = studentId;  // 이후 스튜던트 필드 선언해줘야 함
    }

    // 학생 연구(공부) 기능
    // 부모의 메서드 외에 다른 메서드를 추가한 것.
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    @Override  // override: 재정의한다.
    public void introduce() { // 부모클래스(Person)에 있는 매서드를 재정의
        // 기존의 Person의 introduce는 그대로 쓰고
        // studentId를 추가한다.
        // super==부모
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");

    }
}
