package ch01;

public class DataTypes
{
    public static void main(String[] args) {
        // 1. 정수형 자료형
        // 대부분의 쓰는 자료형
        int age = 25; // int -21억 ~ 21억
        long mylong = 1234123123L; // long  -9,223,372,036,854,775,808부터 9,223,372,036,854,775,807까지
        // 잘 안씀
        short no = 10; // short -3만2천 ~ 3만2천
        byte mybyte = 10;
        // 바이트(bytes)
        // 1 bit (0 or 1, 이두개)
        // 0 : 1비트, 1 : 1비트 (2진수 개념에서, 전기가 통한다 안통한다
        // 1 bit x 8 개 ; 01001011: 1 바이트(byte)
        // int: 4바이트를 저장할 수 있음.
        // 0100            1       0       1       1
        // 2^7            2^4     2^3     2^2      1
        // 64 + 8 + 2 + 1 =75
        // long: 8바이트 저장할수 있음.

        // 2. 실수행 자료형(소숫점이 있는 숫자, 10.0: 실수, 10: 정수)
        // 실수: Flooting-Point
        // 실수형은 뒤에 소숫점 붙여주는게 좋음
        float myFloat = 3.14f;  // 4바이트
        // almost 이것만 사용
        double pi = 3.14159;  // 8바이트

        // 3. 문자행 자료형(character)
        // 글자1개 저장 가능, A, a, 1, #
        // 자바에서 잘 사용 안함
        // 근데 실제로는 글자로 저장하는게 아니라 숫자로 변환해서 저장함
        // 아스키코드 개념, 유니코드(Unicode)
        // 2바이트 공간크기,
        char myChar = 'A';

        // 4. 논리형 자료형(Boolean Type)
        // 참 or 거짓(true/false) 값을 저장가능한 자료형
        // is변수형
        boolean isTrue = true;
        boolean iskorean = false; // 한국사람이 아닙니다. 이것을 저장하고 싶을 때

        // 변수명 = 값, 값을 변수 공간에 저장한다, 대입한다, 할당한다

    }
}
