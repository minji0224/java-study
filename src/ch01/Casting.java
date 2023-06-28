package ch01;

public class Casting {
    public static void main(String[] args) {
        // 형변환(형식 변환, Casting, conversion)
        // casting(배우를 캐스팅한다, 마법주물을 외운다)
        // 변수나 값의 자료형을 다른 자료형으로 변환하는 과정

        // 1. 묵시적 형변환(자동 형변환, implicit conversion)
        // implicit(묵시적): 무언가 표기/표현을 하지 않아도 내부적으로 알아서 해주는 것
        // 웬만하면 잘 안 쓰는게 좋음.(알 수 없는 오류 가능성, side-effet, smell)

        // 예) 변수선언을 정수형으로 했다가 후에 실수형으로 바꿔야 될 때
        int x = 10;
        System.out.println(x);
        double y = x;
        System.out.println(y);
        /*
        묵시적 변환의 원리는 좁은 값을 저장할 수 있는 변수를 더 넓은 값을 저장할 수 있는 변수에 대입
        (기존보다 공간이 큰 곳으로 갈 수 있다)
           double a = 10.5;
           int b = a;
           (이것은 안되고 아래 명시적 형변환으로)
         */

        // 명시적 형변환(explicit conversion)
        // 명시적(explict): 표기를 해주는 것
        double a = 10.5;
        int b = (int) a;
        System.out.println(b);


        // 완성형: 가능한 초/중/종성 조합을 코드로 만들어 놓음(뷁, 댥)
        // 조합형: 초성코드 따라서 중성코드 따로 종성코드 따로

        char c = '궯';
        int num = c;
        System.out.println(num);
        // 궭이라는 유니코드 숫자 값이 int 값으로 바로 나오는 것
        // 완성형 코드를 저장한다.


        // 문자열을 슷자로 변환할 때
        // "10" -> 10 (문자열에서 숫자로 변환하는 것)

        // 1.
        int number = 10;
        String str = Integer.toString(x);
        // (Integer: 정수)
        // (toString: 괄호를 숫자로 바꿔라)

        // 2.
        String strValue = String.valueOf(x);
        System.out.println(strValue);

        // 3. 숫자를 문자로 변환하는 법
        // 소숫점이 있는 10진수: decimal
        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        System.out.println(strDecimal);
        String strDecimalValue = String.valueOf(decimal);
        System.out.println(strDecimalValue);
        // String.valueOf(아무데이터타입값)



        // 문자열 -> 숫자
        String numStr = "10";
        // 자료형클래스.valueOf(문자열)

        int num1 = Integer.valueOf(numStr);
        System.out.println(num1);

        int num2 = Integer.parseInt(numStr);
        System.out.println(num2);

        double num3 = Double.valueOf(numStr);



        // 정리: 데이터타입.valueOf(입력값):
        // String.valueOf(숫자자료형): 숫자 > 문자열
        // Integer.valueOf(문자열): 문자열 > 정수
        // Double.valuOf(문자열): 문자열 > 실수

        // 자바의 숫자를 저장하자
        // 소수점 X: int
        // 소수점 X, 20억 이상: long
        // 소수점 0: double
        // 글자를 저장: String


        // 연습문제
        //문제 1:
        //문자열을 숫자로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "123"을 숫자로 변환하면 정수 123이 출력되어야 합니다.
        String num111 = "123";
        int num5 = Integer.valueOf(num111);
        System.out.println(num5);


        //문제 2:
        //실수를 문자열로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 실수 3.14를 문자열로 변환하면 "3.14"가 출력되어야 합니다
        double num222 = 3.14;
        String num444 = String.valueOf(num222);
        System.out.println(num444);


        //문제 3:
        //문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "456"을 정수로 변환하면 숫자 456이 출력되어야 합니다.
        String num7 = "456";
        int num8 = Integer.valueOf(num7);
        System.out.println(num8);


        //문제 4:
        //문자열을 실수로 변환하여 출력하는 프로그램을 작성하세요. 예를 들어, 문자열 "2.718"을 실수로 변환하면 숫자 2.718이 출력되어야 합니다
        String num9 = "2.718";
        double num88 = Double.valueOf(num9);
        System.out.println(num88);








    }
}
