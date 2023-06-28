package ch04;

public class EnhancedFor {
    public static void main(String[] args) {
        // 향상된 for문
        // 배열/컬렉션 같이 여러개의 값을 저장할 수 있는 자료구조를 순차적으로 탐색
        // 처음부터 끝까지 반복문을 돈다.
        // int i = 0; i < 배열크기; i++ -> 자꾸 써야돼서 힘들어서 만들어 낸 것.
        // 인덱스 값은 모름

        int[] numbers = {1, 2, 3, 4, 5};
        // 향상된 for문을 이용하여 배열 순회
        for(int number : numbers) {
            System.out.println(number);
        }


    }
}
