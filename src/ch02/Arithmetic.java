package ch02;

public class Arithmetic {
    public static void main(String[] args) {
        // arithmetic(산술) 연산(operation)
        // +, -, 나누기, 곱하기
        // 컴퓨터공학: 수학 > 이산수학(dicrete mothmatic), 선형대수학(linear algebra)
        // 이산수학: 수열, 순열, 조합, 경우의 수(수학1, 고2)
        //       -> 알아둘 필요가 있음
        // 패턴(규칙)을 찾고, 수식화 한다. (2n + 1, 3 5 7 ...)
        // 선형대수학: 행렬, 벡터
        //       -> 게임그래픽스, 인공지능


        // 대입연산 = (할당, 대입, assignment)

        // + 더하기
        int a = 10;
        int b = 3;

        // sum 합산을 나타내는 단어
        int sum = a + b;
        int sum1 = 10 + b;
        System.out.println(sum);
        System.out.println(sum1);

        // - 빼기
        int difference = a - b;
        System.out.println(difference);

        // * 곱셈(별표, asterisk)
        // product, multiply
        int product = a * b;
        System.out.println(product);

        // / 나누기(slash)
        // div(divide): 나누다
        // quotient: 몫
        int quotient = a / b;
        System.out.println(quotient);
        // int 정수라 나머지 값은 버리는 결과가 나옴 > 아래에 나머지 값 구하는 법

        // 나머지, %(remainder)
        int remainder = a % b;
        System.out.println(remainder);




    }
}
