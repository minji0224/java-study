package ch05;

// 주문정보 / PurchaseOrder(구매주문)
// 상거래 시스템의 기본
// 물건 구매, 예약, 배달 주문, 중고거래 등
// OrderInfo : 소프트웨어 개발자는 데이터/정보를 다루는 사람이다(Info)
// 데이터/정보: 문자열, 숫자, 파일(이미지, 문서)
// 예약여: 일반적으로 시스템에서 사용하는 용어 ex) order, class, public 등

// 일반적으로 class는 public
// class 이름은 파스칼(대문자시작단어+대문자시작단어...)
// 그 외 kebab-case(order-info, 주소url, 사이트명칭, 컴포넌트이름 등, 주로 소문자 단어사이에 -)
// snake-case(order_info, 데이터베이스시스템, 단어사이에 underscore 를 씀, 단어는 주로 소문자이나, 대문자만으로 하는 경우도 있음)
// ORDER_INFO

public class OrderInfo {
    // Id(IdentificationL 신원)
    // 필드(멤버변수, field): 클래스에 선언된 변수를 필드라고 한다.
    // 필드는 자바에서 아주 일반적으로 private 앞에다 씀
    // 데이터/정보 1건에 이름/번호를 붙이는 행위
    // 필드: 데이터 영역
    private String orderId;         // 주문번호

    private String customerName;   //  고객명

    private String productName;   // 제품명

    private double totalPrice;     // 주문금액

    private int quantity;           // 주문수량(개수)



    // 매서드(method)
    // 클래스의 기능적인 부분, 실행하고, 수행할 수 있는 단위의 코드
    // 매서드도 일반적으로 앞에 public 붙는다.
    // 메서드도 카멜케이스(camel-case)로 표기

    // 클래스명과 동일한 이름의 메서드를 생성자(Constructor)
    // 객체(object)를 생성할 때 사용
    // 객체(object, instance)는 클래스로 찍어낸 걸 객체라고 한다.

    public OrderInfo(String orderId, String customerName, String productName, double totalPrice, int quantity) {
        // this라고 하는 것은 현재 객체를 말함
        // this.필드명: 현재 객체의 필드에 접근한다.
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Quantity: " + quantity);
    }

    public void increaseQuantity(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("수량이 추가되었습니다. 총 수량: " + quantity);
    }



    // setter : 필드의 값을 변경할 때 사용


    // public void set필드명(...){
    // this. 필드명 = 필드명;
    // }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    // getter: 필드값을 반환할 때 사용
    public String getOrderId() {
        return orderId;
        // return 값을 반환;
    }



    // 메서드 작성형식
    // 아무것도 반환하지 않으면 void
    // 매개변수(parameter): 입력 값에 대해서 형식을 지정
 /*
      공개범위(public/private)   반환타입(String, void)   매서드이름     (매개변수)   {
      실행되는 코드 ...
      [return 반환값]
       }
  */




}

