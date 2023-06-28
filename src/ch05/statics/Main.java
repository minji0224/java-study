package ch05.statics;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();   // ++             // 객체 생성한 것
        // c.count == 1
        System.out.println(c.getCount());// ++
        // c.count == 2

        Counter c2 = new Counter(); // ++
        // c2.count == 1(x), c2.count == 3
        System.out.println(c2.getCount()); // ++
        // c2.count == 2(x), c2.count == 4
    }
}
