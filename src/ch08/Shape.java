package ch08;

// interface
// Shape (도형)
// interface: 빈 도형을 만들고 다른 곳에서 만들라고 ~ 사용하는 듯
// 인터페이스에서 리턴값이 void 이면 다른 클래스도 void 리턴값 맞춰줘야됨
// 인터페이스는 객체 생성이 불가능하다.
// 인터페이스는 클래스틀과 다름 왜냐면 인터페이스는 구현을 아예 못함

/*
인터페이스 사용 이유
1. 구현 클래스들의 기본 스펙(기능)을 정의
 */
public interface Shape {
    double calculateArea();   // 면적 계산       // 추상메서드 (구현체가 없는 / 메서드시그니처밖에 없는)
    double calculatePerimeter();   // 둘레 계산      // 추상메서드(구현체가 없는 / 메서드시그니처밖에 없는)

    // 매개변수가 없어서 다른 클래스에서 필드를 선언하고 필드값으로 계산해야 됨.


    /*
    예시
        int add(int a, int b);       // 덧셈 메서드 선언
        int subtract(int a, int b);   // 뺄셈 메서드 선언
    이렇게도 가능
     */

}
