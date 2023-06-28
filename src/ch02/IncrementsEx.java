package ch02;

public class IncrementsEx {
    public static void main(String[] args) {

        //변수 x를 5로 초기화하고, 후위 증감 연산자를 사용하여 x의 값을 출력한 후, x의 값을 1만큼 증가시키세요.
        int x = 5;
        int y1 = x++;
        System.out.println(x);

        //변수 y를 7로 초기화하고, 전위 증감 연산자를 사용하여 y의 값을 출력한 후, y의 값을 2만큼 감소시키세요.
        int y = 7;
        int z1 = --y;
        System.out.println(--y);

        //변수 a를 10으로 초기화하고, 후위 증감 연산자를 사용하여 a의 값을 출력한 후, a의 값을 3만큼 감소시키세요.
        int a = 10;
        int p1 = a-- + a-- + a--;
        System.out.println(a);

        //변수 b를 15로 초기화하고, 전위 증감 연산자를 사용하여 b의 값을 출력한 후, b의 값을 4만큼 증가시키세요.
        //
        //변수 i를 3으로 초기화하고, 후위 증감 연산자를 사용하여 i의 값을 출력한 후, i의 값을 2만큼 증가시키세요.
        //
        //변수 j를 6으로 초기화하고, 전위 증감 연산자를 사용하여 j의 값을 출력한 후, j의 값을 1만큼 감소시키세요.
        //
        //변수 n을 8로 초기화하고, 후위 증감 연산자를 사용하여 n의 값을 출력한 후, n의 값을 3만큼 감소시키세요.
        //
        //변수 m을 12로 초기화하고, 전위 증감 연산자를 사용하여 m의 값을 출력한 후, m의 값을 5만큼 증가시키세요.
        //
        //변수 p를 2로 초기화하고, 후위 증감 연산자를 사용하여 p의 값을 출력한 후, p의 값을 4만큼 증가시키세요.
        //
        //변수 q를 9로 초기화하고, 전위 증감 연산자를 사용하여 q의 값을 출력한 후, q의 값을 2만큼 감소시키세요.


        System.out.println("-------------------");


        int price = 187000;
        int oman = price / 50000;
        int ilman = price % 50000 / 10000; // 37000
        int ochun = price % 10000 / 5000; // 7000
        int ilchun = price % 5000 / 1000;

        // 큰 금액의 지폐를 먼저 지불하고
        // 5만원 다 내고 > 남은 것 1만원 > 남은 것 오천 > 남은 것 천


        System.out.println("-------------------");


        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        int remainColorPen = colorPen % studentCount;
        System.out.println(divColorPen);
        System.out.println(remainColorPen);





    }
}
