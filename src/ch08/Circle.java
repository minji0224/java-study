package ch08;

// implements 쓰기
// 인터페이스 여러개 사용 가능 implements 뒤에 붙이기
// 항상 인터페이스 사용하면 구현해줘야 됨.

// implements Comparable<Student>
// Comparable 도 인터페이스임 따라서 comparableTo로 구현해줘야 됨

public class Circle implements Shape {

    // 인터페이스의 추상메서드에서 매개변수가 없어서 다른 클래스에서 필드를 선언하고 필드값으로 계산해야 됨.
    // 인터페이스에서 리턴값이 void 이면 다른 클래스도 void 리턴값 맞춰줘야됨
    // 구현체로만 객체 생성이 가능하다

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;    //Math.PI는 자바에 있는 예약어?
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
