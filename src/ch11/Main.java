package ch11;
// 입려값을 받을 때 입력값을 잘못받으면 에러가 뜸 그래서 트라이캐치로 예외처리 해줘야 함.

public class Main {
    public static void main(String[] args) {
        try {
            int term = 0;         // 이것을 입력값이라고 생각해보면 // 0이 되는 케이스는 주로 입력값을 제대로 못받은 경우임.
            int amount = 240;
            int result = amount/ term;
            System.out.println("한달에 " + result + "만원");
         } catch (ArithmeticException e) {   // 특정 예외 상황
            System.out.println("산술연산 예외 발생: " + e.getMessage());
            System.out.println("나누기 연산의 값을 정확히 입력해주세요.");
        } catch (Exception e) {  // 일반적인 예외상황 // Excaption은 상위클래스라 맨 마지막에 넣어줘야 함.
            System.out.println(e.getMessage());
        }

    }
}
