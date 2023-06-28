package ch08;

public class Main {
    public static void main(String[] args) {




        Shape s = new Circle(5);
        // Shape s = new Shape(5);
        // Shape 타입은 객체가 없기 때문에 구현하려는 클래스의 객체를 생성해야 됨.
        // 인터페이스는 객체 생성이 불가능하다.
        // 구현체로만 객체 생성이 가능하다
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());



        // 인터페이스를 쓰는 이유 1 : 갈아끼기 쉽다.
        // 회사 경영진이 "야 원으로 하니깐 후져, 사각형으로 바꿔"
        // 위에 있는 서클객체를 아래로 바꾼 것
        // Shape s = new Rectangle(10, 10);

    }
}
