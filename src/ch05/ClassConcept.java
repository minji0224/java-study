package ch05;


// default(많이 사용 안함)
class TestClass {
    // default 접근제한 : 패키지범위, 상속(x)
    void performTest() {

    }
}
public class ClassConcept {
    public static void main(String[] args) {
        // 클래스: 구조화된 데이터 구조를 생성하기 위한 틀(템플릿 template)
        // 같은 역할을 수행하는 코드를 찍어서 사용하기 위한(재사용)
        // OOP(Object Oriented Programing)
        // OOP -> CBD(componment based design) -> SOA(service oriented architecture)
        // design: 코드 수준의 설계
        // OOP, 공학적인 방법론들은 규모확장과 관련이 있다.
        // 단점: boiler-plate의 증가(코드를 시작하기 위한 기본 뼈대)

        // 첫번째 주문 정보 객체 생성
        // 객체를 생성할 때는
        // 클래스명 객체명 = new 클래스명();
        OrderInfo order1 = new OrderInfo("OR001", "HONG DOW", "Product A", 49.99, 2);
        order1.displayOrderDetails();
        System.out.println();
        // 두번째 주문 정보 생성
        OrderInfo order2 = new OrderInfo("OR002", "jina", "Product B", 33.3, 3);
        order2.displayOrderDetails();



        // 변수를 선언할 때 자료형 변수명
        // 클래스: 개발자가 만들어낸 자료형


        // 빈 생성자로 주문정보 객체 1개를 생성




        // 데이터 값이 아무것도 없음
        /*
        빈 생성자는 코딩을 안해도 기복적으로 만들어짐(자바에서 랜덤으로)
        생성자를 별도로 만들면 기본적으로 있는건 사라짐
        OrderInfo order3 = new OrderInfo();
        order3.orderId = "0R6548";

        자바에서는 다른 클래스에서 필드에 접근할 때는 매서드로만 접근한다.
         */
//        OrderInfo order3 = new OrderInfo();
//        order3. displayOrderDetails();
//        System.out.println();
//        order3.setOrderId();
//        System.out.println();

        // 메서드 실행(호출,call)
        // 객체명, 메서드명(...);
        // 메서드 블럭안의 코드가 실행됨
        // 리턴값이 있다면 변수에 할당됨.
        // System.out.println(order3.getOrderId());

        // String val = getOrderId();
        // sout(val);














    }
}
