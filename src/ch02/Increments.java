package ch02;

public class Increments {
    public static void main(String[] args) {
        // increment, decrement(reduction)
        // 증가 또는 감소 연산
        int a = 10;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);

        // 증가연산
        // ++(쁠쁠) +1을 말하는 것,
        // ++++(샵) +2를 말하는 것
        // 증가 연산은 결과적으로 변수의 값을 증가시킨다.
        // a = a + 1; (같은 것)
        System.out.println(++a);
        System.out.println(a);

        System.out.println("-------------------");


        // 후행 연산
        // 현재 실행하고 잇는 구문(statement)에서는 현재 값을 반영
        // 다음 구문부터 증가된 값이 반영
        System.out.println(a++);    // 세미컬런으로 끝나는 1개의 단위를 구문, 식(expression)
        System.out.println(a);

        int x = 5;
        int y = x++ + ++x;
        System.out.println(y);
        // 값이 12가 되는 것은 x++은 후행이라 5로 계산하고 그 뒤에 나오는 ++x의 x는 6으로 계산되어 6+1=7이므로 5+7이다.



        System.out.println("-------------------");


        // 감소 연산
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);


    }
}
