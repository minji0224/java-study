package ch02;

public class TemaryOperator {
    public static void main(String[] args) {
        // 삼항연산자
        // 항이 3개다 // 항은 연산의 대상
        // 1항 연산자: ++a
        // 2항 연산자: a + b

        // 3항 연산의 구조
        // 조건식 ? 값1 : 값2
        // 조건식의 값이 true이면: ?뒤의 값을 반환하고,
        // 조건식의 값이 false이면: 뒤의 값을 반환한다.
        // 조건식을 true/false를 반환할 수 있는 식만 나온다.
        int num1 = 10;
        int num2 = 5;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(" 더 큰 숫자는:" + max);
        // int max = (true) ? num1 : num2
        //           조건식 값이 true이기 때문에 ?뒤에 있는 num1인 10을 출력
        // 조건식이 false이면 num2인 5를 출력
    }
}
