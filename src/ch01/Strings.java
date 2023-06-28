package ch01;

public class Strings {
    public static void main(String[] args) {

        // Carl + /, 선택 영역만큼 주석이 생김
        // /* ... */ 여러줄을 주석으로 표시


        // srting(문자열)
        // 문자를 ㅇ여러개로 연결(문자의 배열)
        String greeting = "Hello, Wolrd!";

        // 자바에서 문자열(String)은 기본 자료형이 아니다.
        // char(문자타입)을 여러개를 연결한 것과 같아.
        /*
        (스트링 오른쪽 버튼 이동, 선언으로 보기) :
        String str = "abc";
        is equivalent to:
        char data[] = {'a', 'b', 'c'};
         */

        // 문자열 초기화방법 (쌍따옴표)
        // 문자열 값을 코드에 직접 입력한 것을 리터럴(literal)이라고 한다.
        String firstName = new String("John");
        String lastName = "Doe";

        // 문자열 결합(concat)
        // 변수를 참조해서 사용할 때는 이름은 대소문자를 가립니다(case-sensitve)
        String fullName = firstName + " " + lastName;
        // 쌍따옴표에는 " (내가 쓸말) "
        System.out.println(fullName);

        // 제어문자(escape characters, escape sequence)
        // 문자열 처리에 특수문자, 줄바꿈, 쌍따옴표, 탭 등을 표시할 때
        // String message = "";


        // 쌍따옴표
        String doubleQuote = "\"Hello, World\"";
        System.out.println(doubleQuote);

        // 줄바꿈
        String message = "Hello\nWorld";
        System.out.println(message);
        // \ = 백스페이스, 백슬래시
        // n = 뉴라인

        // 탭
        String tabMessage = "Hello\tworld";
        System.out.println(tabMessage);

        // 백슬래쉬
        String back = "Hello\\World";
        System.out.println(back);





    }
}
