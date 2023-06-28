package ch09;

// LinkedList를 이용하여 스텍(Stack)이라는 자료구조 만들기


// 스텍은 LIFO(Last In First Out) 형태의 자료구조 :
// 가장 나중에 넣은 것이 가장 먼저 처리되는 형태릐 자료 구조
// 접시를 쌓아놓고 설거지를 하는 것과 비슷하다.

// ex 1) 메서드 호출이 스택에 쌓아놓고 실행된다.
// a() -> b() -> c() : 실행 순서는 c() -> b() -> a()
// a안에서 b를 호출하고 b안에서 c를 호출한다는 말

import java.util.LinkedList;

// ex 2) 웹 브라우저 뒤로가기 : 가장 나중에 열린 페이지부터 뒤로 가기를 실행한다.
// NavigationStacck : 1 -> 2 -> 3 -> .... 뒤로가기를 누르면 3 -> 2 -> 1
public class GenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    // 요소추가
    public void push(T item) {
//        stack.addFirst(item);
        stack.addLast(item);
    }

    // 가상 마지막 요소 1개 꺼내오기
    public T pop() {
//        return stack.removeFirst();
        return stack.removeLast();
    }
}
