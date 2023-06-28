package ch09;

import java.util.LinkedList;

// 큐(Queue) : 대기열 ,FIFO(Frist In First Out)
// 가장 먼저 들어간 것이 가장 먼저 처리됨
// ex) 메세지 처리 시스템
public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();


    // 요소 추가
    // 가장 마지막 위치에 넣는 것
    // ----------------
    //     ...  3  2  1            // 들어오는곳과 나가는곳이 다름 en Queue -> de Queue
    // ----------------

    public void enqueue(T item) {
        queue.addLast(item);
    }
    public T dequeue() {
        return queue.pollFirst(); // .removeFirst랑 똑같은듯
    }


}
